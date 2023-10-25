
package telecom.ERT.web;




import java.util.ArrayList;

import java.util.List;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import telecom.ERT.model.FamilyPackage;

import telecom.ERT.repository.FamilyPackageRepository;


@Controller

public class MemberController {
    private final FamilyPackageRepository familyPackageRepository;


    public MemberController(FamilyPackageRepository familyPackageRepository) {
        this.familyPackageRepository = familyPackageRepository;
    }


    @GetMapping("/selected-package")
    public String showSelectedPackage(@RequestParam("packageId") Long packageId, Model model) {
        FamilyPackage selectedPackage = familyPackageRepository.findById(packageId).orElse(null);


        if (selectedPackage != null) {
            model.addAttribute("selectedPackage", selectedPackage);
            return "selected-package";
        } else {
            return "error-page";
        }
    }


    @PostMapping("/add-members")
    public String addMembers(
            @RequestParam("packageId") Long packageId,
            @RequestParam("numMembers") int numMembers,
            @RequestParam List<String> memberPhoneNumbers,
            Model model
    ) {
        FamilyPackage selectedPackage = familyPackageRepository.findById(packageId).orElse(null);


        if (selectedPackage != null) {
            try {
                int maxAddonMembers = Integer.parseInt(selectedPackage.getAddonmembers());


                if (numMembers <= maxAddonMembers) {
                    List<String> addedMembers = new ArrayList<>();
                    
                    for (String phoneNumber : memberPhoneNumbers) {
                        if (!addedMembers.contains(phoneNumber)) {
                            addedMembers.add(phoneNumber);
                        } else {
                            model.addAttribute("error", "Phone number '" + phoneNumber + "' is already added.");
                            model.addAttribute("selectedPackage", selectedPackage);
                            model.addAttribute("addedMembers", addedMembers);
                            return "selected-package";
                        }
                    }


                    model.addAttribute("selectedPackage", selectedPackage);
                    model.addAttribute("addedMembers", addedMembers);


                    return "added-members";
                } else {
                    model.addAttribute("error", "You have exceeded the maximum number of members allowed for this package.");
                    return "selected-package";
                }
            } catch (NumberFormatException e) {
                model.addAttribute("error", "Invalid 'addonmembers' property. Please contact the administrator.");
                return "selected-package";
            }
        } else {
            return "error-page";
        }
    }


    

}