/**
 * Created by geyan on 21/06/2017.
 */
public class ExecutionProcess {

    private String packageName;
    private String launchActivityName;

    public String obtainPackageName(){
        String CmdForPackageName = Properties.CmdForPackageNameP1+Properties.apkFilePath+Properties.CmdForPackageNameP2;
        packageName = CommandRunner.runProcess(false,true,CmdForPackageName);
        return packageName;
    }

    public String obtainLaunchActivityName(){
        String CmdForLaunchActivityName = Properties.CmdForActivityNameP1+Properties.apkFilePath+Properties.CmdForActivityNameP2;
        launchActivityName = CommandRunner.runProcess(false,true,CmdForLaunchActivityName);
        return launchActivityName;
    }

    public void uninstall(){
        CommandRunner.runProcess(false,false,Properties.CmdForUninstall+packageName);
    }

    public void install(){
        CommandRunner.runProcess(false,false,Properties.CmdForInstall+Properties.apkFilePath);
    }

    public void clearLog(){
        CommandRunner.runProcess(false,false,Properties.CmdForCleanLog);
    }

    public void useTool(Tools tools){
        tools.useTool(packageName,launchActivityName);
    }

    public void generateLogText(){
        CommandRunner.runProcess(false,false,Properties.logcatCmdInit+Properties.logcatTagActivityMangerInfoLevel+
                Properties.logcatFormat+Properties.logcatOtherTagErrorLevel+Properties.locationLogFile);
    }

    public void analyseLogText(){
        LogFilter textReader = new LogFilter();
        textReader.readLogFile();
    }
}
