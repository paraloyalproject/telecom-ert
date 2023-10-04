package telecom.ERT.repository;

import org.springframework.data.repository.CrudRepository;
import telecom.ERT.model.ReferenceIdCounter;

public interface ReferenceIdCounterRepository extends CrudRepository<ReferenceIdCounter, Long> {
}
