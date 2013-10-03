using System;
using System.Windows.Forms;
using System.Diagnostics;
using System.ComponentModel;
using System.Threading;
using System.Security.Permissions;
using System.Management;
using System.Reflection;

using log4net;
using log4net.Config;

[assembly: AssemblyCompany("Flexible Informatics, LLC")]
[assembly: AssemblyProduct("Mirth Service Initializer")]
[assembly: AssemblyCopyright("Copyright 2013")]
[assembly: AssemblyVersion("3.0.0.1")]
[assembly: AssemblyFileVersion("3.0.0.1")]
[assembly: log4net.Config.XmlConfigurator(Watch=false)]
namespace EncaptureMD
{
	/// <summary>
	/// A quick utility for installing and uninstalling the Mirth Connect service.
	/// </summary>
	public class Mirth_Init
	{
		private static readonly ILog log = LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

		private string mirthHome;
		private bool isNewerOS = false;

		public Mirth_Init(string[] args)
		{
			this.mirthHome = System.IO.Path.GetDirectoryName(System.Reflection.Assembly.GetEntryAssembly().Location);

			if(System.Environment.OSVersion.Version.Major >= 6)
			{
				if(log.IsDebugEnabled)
					log.Debug("Found Win Vista, 7, or 8.");

				this.isNewerOS = true;
			}

			if (System.Environment.UserInteractive)
			{
				string parameter = string.Concat(args);
				switch (parameter)
				{
					case "--install":
						try
						{
							if(log.IsDebugEnabled)
								log.Debug("Installing Mirth Connect service");

							DoInstall();
						}
						catch(Exception ex)
						{
							log.Error("Exception installing Mirth Connect service.", ex);
						}
						break;
					case "--uninstall":
						try
						{
							if(log.IsDebugEnabled)
								log.Debug("Uninstalling Mirth Connect service");

							DoRemove();
						}
						catch(Exception ex)
						{
							log.Error("Exception uninstalling Mirth Connect service.", ex);
						}
						break;
				}
			}
			else
			{
				if(log.IsDebugEnabled)
					log.Debug("Installing Mirth Connect service");

				DoInstall();
			}
		}

		#region Installation functions
		public void DoInstall()
		{
			InstallMirthService();

			StartMirthManager();

			Environment.Exit(0);
		}

		private void InstallMirthService()
		{
			if(log.IsDebugEnabled)
				log.Debug("Installing Mirth as a service.");

			string wrapperPath = this.mirthHome + @"\wrapper.exe";
			string wrapperConfPath = this.mirthHome + @"\wrapper.conf";
			ProcessStartInfo wrapInfo = new ProcessStartInfo();
			wrapInfo.WorkingDirectory = this.mirthHome;
			wrapInfo.FileName = String.Format(@"""{0}""", wrapperPath);
			wrapInfo.Arguments = String.Format(@"-i ""{0}""", wrapperConfPath);

			RunProcess(wrapInfo);
		}

		private void StartMirthManager()
		{
			if(log.IsDebugEnabled)
				log.Debug("Starting Mirth Manager.");

			string managerPath = this.mirthHome + @"\Mirth_Manager.exe";
			ProcessStartInfo mi = new ProcessStartInfo();
			mi.WorkingDirectory = this.mirthHome;
			mi.FileName = String.Format(@"""{0}""", managerPath);
			RunProcess(mi);
		}
		#endregion

		#region Removal functions

		public void DoRemove()
		{
			StopMirthService();

			DeleteMirthService();

			StopMirthManager();

			Environment.Exit(0);
		}

		private void StopMirthService()
		{
			if(log.IsDebugEnabled)
				log.Debug("Stopping Mirth service.");

			ProcessStartInfo stopInfo = new ProcessStartInfo();
			stopInfo.FileName = "net";
			stopInfo.Arguments = "stop \"Mirth Connect Service\"";

			RunProcess(stopInfo);
		}

		private void DeleteMirthService()
		{
			if(log.IsDebugEnabled)
				log.Debug("Removing Mirth service.");

			ProcessStartInfo deleteInfo = new ProcessStartInfo();
			deleteInfo.FileName = "sc";
			deleteInfo.Arguments = "delete \"Mirth Connect Service\"";

			RunProcess(deleteInfo);
		}

		private void StopMirthManager()
		{
			if(log.IsDebugEnabled)
				log.Debug("Killing Mirth manager.");

			ProcessStartInfo managerInfo = new ProcessStartInfo();
			managerInfo.FileName = "taskkill";
			managerInfo.Arguments = "/f /im Mirth_Manager.exe";

			RunProcess(managerInfo);
		}

		#endregion

		private void RunProcess(ProcessStartInfo psi)
		{
			if(psi != null)
			{
				psi.WindowStyle = ProcessWindowStyle.Hidden;
				if(this.isNewerOS)
				{
					psi.UseShellExecute = true;
					psi.Verb = "runas";
				}
				else
				{
					psi.CreateNoWindow = true;
					psi.UseShellExecute = false;
				}

				try
				{
					using (Process process = new Process())
					{
						process.StartInfo = psi;

						process.Start();

						process.WaitForExit();

						process.Close();
					}
				}
				catch(Exception ex)
				{
					log.Error("Exception running process", ex);
				}
			}
		}

		[STAThreadAttribute()]
		public static void Main(string[] args)
		{
			try
			{
				new Mirth_Init(args);
			}
			catch(System.AccessViolationException ave)
			{
				log.Error("Exception initializing", ave);
			}
			catch(Exception e)
			{
				log.Error("Exception starting init.", e);
			}
		}

	}
}
