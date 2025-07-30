package uno.rensen.ShutdownMyOwnPC.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CmdUtil {

    public static void runCommand(String cmd) throws Exception {

        if (cmd == null || cmd.isEmpty()) throw new Exception("Invalid command");

        // 执行（当然是Windows）系统命令
        Process process = Runtime.getRuntime().exec(cmd);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        // 读取输出
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // 等待进程完成
        int exitCode = process.waitFor();
        System.out.println("Exit Code: " + exitCode);

    }
}
