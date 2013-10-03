/*
 * Created by SharpDevelop.
 * User: ebellinger
 * Date: 6/14/2012
 * Time: 1:48 PM
 * 
 */
using System;
using System.Diagnostics;
using System.ComponentModel;
using System.Threading;
using System.Security.Permissions;
using System.Management;
using System.Reflection;
using System.ServiceProcess;
using System.ServiceProcess.Design;
using System.Configuration.Install;

using log4net;
using log4net.Config;

[assembly: AssemblyCompany("Flexible Informatics, LLC")]
[assembly: AssemblyProduct("Mirth Connect Service")]
[assembly: AssemblyCopyright("Copyright 2013")]
[assembly: AssemblyVersion("1.0.0.0")]
[assembly: AssemblyFileVersion("1.0.0.0")]
[assembly: log4net.Config.XmlConfigurator(Watch=false)]
namespace EncaptureMD
{
	/// <summary>
	/// Description of Mirth_Service.
	/// </summary>
	public class Mirth_Service : ServiceBase
	{
		private static readonly ILog log = LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);	

		private static Mutex s_Mutex;
		
		private Mirth mirth = null;
					
		public Mirth_Service()
		{
			//Detect if another instance is already running.  If so, exit.
			bool instantiated;
			s_Mutex = new Mutex(false, "Global\\{569a0db0-b649-11e1-afa6-0800200c9a66}", out instantiated);
			if(!instantiated)
			{
				log.Error("The Mirth Connect service is already running.");
				return;
			}
			
			InitializeComponent();
		}
		
		public static void Main(string[] args)
        {
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
							
							ManagedInstallerClass.InstallHelper(new string[] { Assembly.GetExecutingAssembly().Location });
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
							
							ManagedInstallerClass.InstallHelper(new string[] { "/u", Assembly.GetExecutingAssembly().Location });
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
					log.Debug("Starting Mirth Connect service");
				
				ServiceBase[] ServicesToRun = new ServiceBase[] { new Mirth_Service() };
				ServiceBase.Run(ServicesToRun);
			}
        }
		
		private void InitializeComponent()
		{
			if(log.IsDebugEnabled)
				log.Debug("InitializeComponent");
			
			this.ServiceName = "Mirth Connect Service";
			
			this.CanShutdown = true;
			this.CanStop = true;
		}
		
		protected override void OnStart(string[] args)
		{
			if(log.IsDebugEnabled)
				log.Debug("OnStart");
			
			try
			{
				this.mirth = new Mirth();
				this.mirth.Start();
			}
			catch(Exception ex)
			{
				log.Error("Exception starting service.");
			}
			bool foundLauncher = false;
			try
			{
				Process[] prs = Process.GetProcesses();
				foreach (Process pr in prs)
				{
					if (pr.ProcessName == "Mirth_Launcher")
					{
						foundLauncher = true;
						break;
					}
				}
			}
			catch(Exception ex)
			{
				log.Error("Exception starting Mirth Connect Service.");
			}

			if(!foundLauncher)
			{
				log.Error("Did not find launcher process. Exiting.");
				this.OnStop();
			}
		}

		protected override void OnStop()
		{
			if(log.IsDebugEnabled)
				log.Debug("OnStop");

			try
			{
				this.mirth.Stop();
			}
			catch(Exception ex)
			{
				log.Error("Exception stopping service.");
			}
		}
	}
	
	[RunInstaller(true)]
	public class Mirth_Service_Installer : Installer
	{
		private ServiceProcessInstaller serviceProcessInstaller;
		private ServiceInstaller serviceInstaller;

		public Mirth_Service_Installer()
		{
			this.serviceProcessInstaller = new ServiceProcessInstaller();
			this.serviceInstaller = new ServiceInstaller();
			
			this.serviceProcessInstaller.Account = ServiceAccount.NetworkService;
			
			this.serviceInstaller.ServiceName = "Mirth Connect Service";
			this.serviceInstaller.Description = "Mirth Connect Service";
			this.serviceInstaller.StartType = ServiceStartMode.Automatic;
			
			this.Installers.Add(this.serviceProcessInstaller);
			this.Installers.Add(this.serviceInstaller);
		}
	}
}
