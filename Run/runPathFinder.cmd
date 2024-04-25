@echo off

SET JAVA_HOME="C:\Program Files\Java\jdk-17.0.2"

SETLOCAL enabledelayedexpansion
cd ..

for /r . %%g in (\target\PathFinderVisualizator-*.jar) do set s=%%g 
echo %s%
	
echo 'Iniciando PathFinder ... '
%JAVA_HOME%\bin\java -jar %s% -classpath .\target 
pause