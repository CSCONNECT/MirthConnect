;;Mirth Connect Installer creation script
;;
#define MyAppLocation "C:\Development\Projects\EncaptureMD\mirth\emd_mirth\branches\3.0.0dev"
#define MyOutputDir "C:\Development\Projects\EncaptureMD\mirth\emd_mirth\branches\3.0.0dev\installer"
;;
;;
;; Change this to the appropriate version number
#define MyAppVersion "3.0.0.2"
;; the version number as seen on right-click of installer exe
#define MyBinVersion "3.0.0.2"
;;
#define MyAppName "Mirth Connect"
#define MyAppPublisher "Mirth Corporation"
#define MyAppUrl "http://www.mirthcorp.com/"
#define MyCopyright "(C) 2013 Mirth Corporation"
#define MyAppId "139169f4-b59f-11e1-afa6-0800200c9a66"
#define MyLockFile "{userappdata}\" + MyAppName + "_Installer.lockfile"
;;
;;
[Setup]
AppId={#MyAppId}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppUrl}
AppSupportURL={#MyAppUrl}
AppUpdatesURL={#MyAppUrl}
AppCopyright={#MyCopyright}
DefaultGroupName={#MyAppName}
OutputDir={#MyOutputDir}
OutputBaseFilename=Mirth_Connect_installer_{#MyAppVersion}
SetupIconFile={#MyAppLocation}\server\public_html\images\mirth_128_ico.ico
UninstallDisplayIcon={app}\public_html\images\mirth_128_ico.ico
Compression=lzma2/ultra
SolidCompression=yes
VersionInfoCompany={#MyAppPublisher}
VersionInfoProductName={#MyAppName}
VersionInfoProductVersion={#MyBinVersion}
VersionInfoTextVersion={#MyAppVersion}
VersionInfoVersion={#MyBinVersion}
VersionInfoCopyright={#MyCopyright}
ChangesEnvironment=yes
PrivilegesRequired=admin
DefaultDirName={pf}\Mirth Connect
LicenseFile={#MyAppLocation}\server\setup\docs\LICENSE.txt

[Dirs]
Name: "{app}"; Permissions: everyone-modify;

[Tasks]
;;creates a set of checkboxes that lets the user decide which shortcuts to create.  checked by default.
Name: "startmenuicon"; Description: "Create a Start Menu shortcut"; GroupDescription: "Additional icons:";

[Files]
Source: "{#MyAppLocation}\server\setup\*"; DestDir: "{app}"; Excludes: ".svn\*"; Flags: ignoreversion recursesubdirs createallsubdirs uninsneveruninstall onlyifdoesntexist;

[Icons]
;;creates a shortcut to in the user's startup folder
Name: "{group}\Mirth Manager"; FileName: "{app}\Mirth_Manager.exe"; WorkingDir: "{app}"; Tasks: startmenuicon;

[Run]
Filename: "{app}\Mirth_Init.exe"; Parameters: "--install"; Description:  "{cm:LaunchProgram,Install Mirth Service}"; Flags: nowait runhidden;

[UninstallRun]
Filename: "{app}\Mirth_Init.exe"; Parameters: "--uninstall"; Flags: runhidden;

[UninstallDelete]
;; This is probably overkill, but we just want to make sure that everything is uninstalled/deleted
Type: filesandordirs; Name: "{app}\client-lib\*";
Type: filesandordirs; Name: "{app}\cli-lib\*";
Type: filesandordirs; Name: "{app}\conf\*";
Type: filesandordirs; Name: "{app}\docs\*";
Type: filesandordirs; Name: "{app}\extensions\*";
Type: filesandordirs; Name: "{app}\lib\*";
Type: filesandordirs; Name: "{app}\licenses\*";
Type: filesandordirs; Name: "{app}\custom-lib\*";
Type: filesandordirs; Name: "{app}\manager-lib\*";
Type: filesandordirs; Name: "{app}\mirthdb\*";
Type: filesandordirs; Name: "{app}\logs\*";
Type: filesandordirs; Name: "{app}\public_html\*";
Type: filesandordirs; Name: "{app}\*";

[Code]
