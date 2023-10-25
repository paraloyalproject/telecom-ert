
package telecom.ERT.web;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;


import telecom.ERT.model.FamilyPackage;

import telecom.ERT.repository.FamilyPackageRepository;


@Controller

public class FamilyPackageController {
    @Autowired
    private FamilyPackageRepository familyPackageRepository;


    @GetMapping("/family-packages")
    public String listFamilyPackages(Model model) {
        List<FamilyPackage> packages = familyPackageRepository.findAll();
        model.addAttribute("packages", packages);
        return "family-packages"; 
    }
    

}