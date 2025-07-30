package uno.rensen.ShutdownMyOwnPC.service;

import org.springframework.stereotype.Service;
import uno.rensen.ShutdownMyOwnPC.utils.CmdUtil;

@Service
public class SysService implements SysServiceInterface {

    @Override
    public void shutdown() throws Exception {

        CmdUtil.runCommand("cmd.exe /c shutdown -s -t 0");

    }

    @Override
    public void restart() throws Exception {

        CmdUtil.runCommand("cmd.exe /c shutdown -r -t 0");

    }

}
