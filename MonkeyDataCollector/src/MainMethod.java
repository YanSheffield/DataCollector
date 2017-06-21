/**
 * Created by geyan on 20/06/2017.
 */
public class MainMethod {

    public static void main(String[] args){
        exe();

    }

    public static void exe(){
        ExecutionProcess executionProcess = new ExecutionProcess();

        executionProcess.obtainPackageName();

        executionProcess.obtainLaunchActivityName();

        executionProcess.uninstall();

        executionProcess.install();

        executionProcess.clearLog();


        executionProcess.useTool(new MATE());

        executionProcess.generateLogText();

        //extract the information from log file
        executionProcess.analyseLogText();
    }

}
