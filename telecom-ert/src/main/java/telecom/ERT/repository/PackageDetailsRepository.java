package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import telecom.ERT.model.PackageDetails;


@Repository

public interface PackageDetailsRepository extends JpaRepository<PackageDetails, Long> {
    // Add custom query methods if needed

}