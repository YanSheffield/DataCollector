/**
 * Created by geyan on 21/06/2017.
 */
public class Monkey implements Tools {

    @Override
    public void useTool(String packageName, String activityName) {
        CommandRunner.runProcess(false,false, Properties.monkeyRunningCmdInit+packageName+Properties.monkeyRunningCmdEventCount);
        System.out.println("Monkey finished");
    }
}
