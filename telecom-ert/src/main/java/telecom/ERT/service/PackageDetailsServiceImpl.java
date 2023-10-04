package telecom.ERT.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import telecom.ERT.model.PackageDetails;
import telecom.ERT.repository.PackageDetailsRepository;

import java.util.List;

@Service

public class PackageDetailsServiceImpl implements PackageDetailsService {

    @Autowired
    private PackageDetailsRepository packageDetailsRepository;

    @Override
    public List<PackageDetails> getAllPackageDetails() {
        return packageDetailsRepository.findAll();
    }

}