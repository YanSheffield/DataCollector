/**
 * Created by geyan on 20/06/2017.
 */
public class MainMethod {
    public static boolean isMonkey = false;

    public static void main(String[] args){
        for (int i = 0;i<2;i++){
            if (!isMonkey){
                System.out.println("----Run MATE----");
                exe(new MATE());
                isMonkey = true;
            }else {
                System.out.println("----Run Monkey----");
                exe(new Monkey());
            }
        }
    }

    public static void exe(Tools tools){
        ExecutionProcess executionProcess = new ExecutionProcess();

        executionProcess.obtainPackageName();

        executionProcess.obtainLaunchActivityName();

        executionProcess.uninstall();

        executionProcess.install();

        executionProcess.clearLog();

        executionProcess.useTool(tools);

        executionProcess.generateLogText();

        //extract the information from log file
        executionProcess.analyseLogText();
    }

}
