package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import telecom.ERT.model.SwitchPrepaidEntity;
import telecom.ERT.service.SwitchPrepaidService;

@RestController
@RequestMapping("/api/switchto")
public class SwitchPrepaidController {

    private final SwitchPrepaidService switchPrepaidService;

    @Autowired
    public SwitchPrepaidController(SwitchPrepaidService switchPrepaidService) {
        this.switchPrepaidService = switchPrepaidService;
    }

    @PostMapping("/submit")
    public SwitchPrepaidEntity submitSwitchPrepaidForm(@RequestBody SwitchPrepaidEntity switchPrepaidEntity) {
        return switchPrepaidService.submitSwitchPrepaidForm(switchPrepaidEntity);
    }
}
