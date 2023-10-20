package telecom.ERT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import telecom.ERT.model.DataBooster;

public interface DataBoosterRepository extends JpaRepository<DataBooster, Long> {
	
}