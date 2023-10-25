
package telecom.ERT.web;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;


import telecom.ERT.model.DataBooster;

import telecom.ERT.service.DataBoosterService;


@Controller

public class DataBoosterController {
    private final DataBoosterService dataBoosterService;


    @Autowired
    public DataBoosterController(DataBoosterService dataBoosterService) {
        this.dataBoosterService = dataBoosterService;
    }


    @GetMapping("/data-booster")
    public String dataBoosterPage(Model model) {
        java.util.List<DataBooster> dataBoosters = dataBoosterService.getAllDataBoosters();
        model.addAttribute("dataBoosters", dataBoosters);
        return "data-booster";
    }   
    @PostMapping("/selectedd-package")
    public String postSelectPackage(@RequestParam("packageId") Long packageId, Model model) {
        DataBooster selectedPackage = dataBoosterService.getDataBoosterById(packageId);
        model.addAttribute("selectedPackage", selectedPackage);
        return "selectedd-package";
    }

}