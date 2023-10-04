package telecom.ERT.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import telecom.ERT.model.PackageDetails;
import telecom.ERT.service.PackageDetailsService;

import java.util.List;

@RestController

@RequestMapping("/api/package-details")

public class PackageDetailsController {

    @Autowired
    private PackageDetailsService packageDetailsService;

    @GetMapping
    public List<PackageDetails> getAllPackageDetails() {
        return packageDetailsService.getAllPackageDetails();
    }

}