/**
 * Created by geyan on 21/06/2017.
 */
public class MATE implements Tools{

    @Override
    public void useTool(String packageName, String activityName) {
        CommandRunner.runProcess(false,false, Properties.startApp+packageName+"/"+activityName);
        CommandRunner.runProcess(false,false, Properties.startMate);
        System.out.println("MATE finished");
    }
}
