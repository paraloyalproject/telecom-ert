package telecom.ERT.service;


import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import telecom.ERT.model.PrepaidFamilyPackage;

import telecom.ERT.repository.PrepaidFamilyPackageRepository;


@Service

public class PrepaidFamilyPackageService {
    private final PrepaidFamilyPackageRepository prepaidFamilyPackageRepository;


    @Autowired
    public PrepaidFamilyPackageService(PrepaidFamilyPackageRepository prepaidFamilyPackageRepository) {
        this.prepaidFamilyPackageRepository = prepaidFamilyPackageRepository;
    }


    public List<PrepaidFamilyPackage> getAllPackages() {
        return prepaidFamilyPackageRepository.findAll();
    }
    
    public PrepaidFamilyPackage getPackageById(Long id) {
        return prepaidFamilyPackageRepository.findById(id).orElse(null);
    }
    public List<String> addMembers(PrepaidFamilyPackage selectedPackage, List<String> memberPhoneNumbers) {
       
        List<String> addedMembers = new ArrayList<>(memberPhoneNumbers);


        return addedMembers;
    }

}