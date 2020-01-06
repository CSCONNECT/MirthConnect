MirthConnect 3.00.CS
================

Based on the 3.0.0 tag (https://svn.mirthcorp.com/connect/tags/3.0.0)

Custom Windows build that includes an FTPs connector.

Uses Inno Setup (http://www.jrsoftware.org/isinfo.php) and Launch4j (http://launch4j.sourceforge.net/) since we don't have access to Mirth's installer files.  

Also makes use of Java Service Wrapper (http://wrapper.tanukisoftware.com/doc/english/download.jsp) to install Mirth as a Windows service.

In this custom build Java 1.8 compatibility issue is solved (XStream serialization problem).
