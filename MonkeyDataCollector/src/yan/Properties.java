package yan;

/**
 * Created by geyan on 21/06/2017.
 */
public class Properties {

    public static String apkFilePath = "/Users/geyan/Desktop/apkFiles/budget.apk";

    public static String CmdForPackageNameP1 = "aapt dump badging ";
    public static String CmdForPackageNameP2 = " | grep package:\\ name";

    public static String CmdForActivityNameP1 = "aapt dump badging ";
    public static String CmdForActivityNameP2 = " | grep launchable-activity";

    public static String CmdForUninstall = "adb uninstall ";
    public static String CmdForInstall = "adb install ";

    public static String CmdForCleanLog = "adb logcat -c";

    public static String logcatCmdInit = "adb logcat -d ";;
    public static String logcatTagActivityMangerInfoLevel = "ActivityManager:I ";
    public static String logcatFormat = "-v brief ";
    public static String logcatOtherTagErrorLevel = "*:E";
    public static String locationLogFile = ">log/with-d7.txt";

    public static String monkeyRunningCmdInit = "adb -e shell monkey --ignore-crashes -p ";
    public static String monkeyRunningCmdEventCount = " 1000";

    public static String startApp = "adb shell am start -n ";
    public static String startMate = "adb shell am instrument -w -r -e debug false -e class org.mate.ExecuteMATE org.mate.test/android.support.test.runner.AndroidJUnitRunner";
}
