using System;
using System.IO;
using System.ServiceProcess;
using Microsoft.Win32;
using System.Diagnostics;
using System.ComponentModel;
using System.Reflection;

[assembly: AssemblyCompany("Flexible Informatics, LLC")]
[assembly: AssemblyProduct("EncaptureMD Remove")]
[assembly: AssemblyCopyright("Copyright 2013")]
[assembly: AssemblyVersion("2.2.1.3")]
[assembly: AssemblyFileVersion("2.2.1.3")]
namespace EncaptureMD
{
	public class Remove
	{
		public static void Main(string[] args)
		{
			try
			{
				Process[] prs = Process.GetProcesses();
				foreach (Process pr in prs)
				{
					if (pr.ProcessName == "Mirth_Launcher" || pr.ProcessName == "Mirth_Manager" || pr.ProcessName == "Mirth_Service")
					{
						pr.Kill();
					}
				}
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
