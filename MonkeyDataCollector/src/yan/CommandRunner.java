package yan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by geyan on 20/06/2017.
 */
public class CommandRunner {
    private static int i = 0;;
    private static final String[] WIN_RUNTIME = { "cmd.exe", "/C" };
    private static final String[] OS_LINUX_RUNTIME = { "/bin/bash", "-l", "-c" };

    @SuppressWarnings("Since15")
    private static <T> T[] concat(T[] first, T[] second) {
        T[] result;
        result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    public static String runProcess(boolean isWin, boolean isNeedReturn, String... command) {
        String[] allCommand = null;
        String packageOrActivityName = null;
        try {
            if (isWin) {
                allCommand = concat(WIN_RUNTIME, command);
            } else {
                allCommand = concat(OS_LINUX_RUNTIME, command);
            }
            ProcessBuilder pb = new ProcessBuilder(allCommand);
            pb.redirectErrorStream(true);
            Process p = pb.start();
            p.waitFor();
            if (!isNeedReturn){
                return null;
            }else {
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String _temp = null;
                List<String> line = new ArrayList<String>();
                while ((_temp = in.readLine()) != null) {
                    line.add(_temp);
                }
                packageOrActivityName = LogFilter.filterPackageOrActivityName(line);
                return packageOrActivityName;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
