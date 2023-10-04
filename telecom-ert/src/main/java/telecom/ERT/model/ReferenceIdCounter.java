package telecom.ERT.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReferenceIdCounter {
    @Id
    private Long id;
    private Long counter;

    public ReferenceIdCounter() {
    }

    public ReferenceIdCounter(Long id, Long counter) {
        this.id = id;
        this.counter = counter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }
}
