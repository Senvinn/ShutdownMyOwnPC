package uno.rensen.ShutdownMyOwnPC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uno.rensen.ShutdownMyOwnPC.service.SysService;

@Controller
@RequestMapping("/api")
public class MainController {

    private final SysService sysService;

    @Autowired
    public MainController(SysService sysService) {
        this.sysService = sysService;
    }

    @PostMapping("/shutdown")
    public String shutdown() {

        try {
            
            sysService.shutdown();
            return "YES！！！";

        } catch (Exception e) {

            e.printStackTrace();
            return "？？失败了我去: " + e.getMessage();
        }


    }

    @PostMapping("/restart")
    public String restart() {

        try {

            sysService.restart();
            return "YES！！！";

        } catch (Exception e) {

            e.printStackTrace();
            return "？？失败了我去: " + e.getMessage();

        }

    }

}
