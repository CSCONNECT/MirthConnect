@echo off

java -jar -server -Xms1024m -Xmx1024m -Xmn512m -XX:MaxPermSize=512m -XX:+CMSClassUnloadingEnabled -XX:+CMSPermGenSweepingEnabled -Djava.awt.headless=true -Dfile.encoding=UTF8 mirth-launcher.jar
