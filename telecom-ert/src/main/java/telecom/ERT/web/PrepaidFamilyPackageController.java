package telecom.ERT.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import telecom.ERT.model.PrepaidFamilyPackage;
import telecom.ERT.service.PrepaidFamilyPackageService;

@Controller
public class PrepaidFamilyPackageController {
    private final PrepaidFamilyPackageService prepaidFamilyPackageService;

    @Autowired
    public PrepaidFamilyPackageController(PrepaidFamilyPackageService prepaidFamilyPackageService) {
        this.prepaidFamilyPackageService = prepaidFamilyPackageService;
    }

    @GetMapping("/family-packages-page")
    public String getFamilyPackages(Model model) {
        List<PrepaidFamilyPackage> familyPackages = prepaidFamilyPackageService.getAllPackages();
        model.addAttribute("familyPackages", familyPackages);
        return "family-packages-page";
    }
    
      @PostMapping("/select-package/{packageId}")
    public String selectPackage(@PathVariable Long packageId, Model model) {
        PrepaidFamilyPackage selectedPackage = prepaidFamilyPackageService.getPackageById(packageId);
        model.addAttribute("package", selectedPackage);
        return "package-details-page";
    }
       
      @PostMapping("/add-members/{packageId}")
      public String addMembers(
              @PathVariable Long packageId,
              @RequestParam("numMembers") int numMembers,
              @RequestParam List<String> memberPhoneNumbers,
              Model model
      ) {
          PrepaidFamilyPackage selectedPackage = prepaidFamilyPackageService.getPackageById(packageId);

          if (selectedPackage != null) {
              int maxLines = selectedPackage.getNumberOfLines();
              if (numMembers <= maxLines) {
                  
                  List<String> addedMembers = prepaidFamilyPackageService.addMembers(selectedPackage, memberPhoneNumbers);

                  model.addAttribute("selectedPackage", selectedPackage);
                  model.addAttribute("addedMembers", addedMembers);

                  return "add-members";
              } else {
                  model.addAttribute("error", "You have exceeded the maximum number of members allowed for this package.");
                  return "selected-package";
              }
          } else {
              return "error-page";
          }

       
}
}
