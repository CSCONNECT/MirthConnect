using System;
using System.IO;
using System.ServiceProcess;
using Microsoft.Win32;
using System.Diagnostics;
using System.ComponentModel;
using System.Reflection;

[assembly: AssemblyCompany("Flexible Informatics, LLC")]
[assembly: AssemblyProduct("EncaptureMD TakeOwnership")]
[assembly: AssemblyCopyright("Copyright 2013")]
[assembly: AssemblyVersion("2.2.1.3")]
[assembly: AssemblyFileVersion("2.2.1.3")]
namespace EncaptureMD
{
	public class TakeOwnership
	{
		public static void Main(string[] args)
		{
			OperatingSystem osInfo = Environment.OSVersion;
			if(osInfo.Version.Major >= 6)
			{
				string installHome = System.IO.Path.GetDirectoryName(System.Reflection.Assembly.GetEntryAssembly().Location);
				ProcessStartInfo ownInfo = new ProcessStartInfo();
				ownInfo.WindowStyle = ProcessWindowStyle.Minimized;
				ownInfo.CreateNoWindow = true;
				ownInfo.UseShellExecute = true;
				ownInfo.Verb = "runas";
				ownInfo.FileName = "PowerShell";
				ownInfo.Arguments = String.Format(@"-Command (New-Object -com 'Shell.Application').ShellExecute('Cmd.exe', '/C ""takeown /f """"""{0}"""""" /r /d y && icacls """"""{0}"""""" /grant administrators:F /t /q""', '', 'runas')", installHome);
				Process.Start(ownInfo);
			}
		}
	}
}
