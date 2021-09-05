package vaadin.spring.example.monitoring;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.time.Instant;

@Entity
@Table(name = "performance")
public class Performance {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @CreatedDate
    @Column(name = "created_on", updatable = false, nullable = false)
    private Instant createdOn;

    @Version
    @Column(name = "opt_lock")
    private long optLock = 0; //Not needed as the entity hasn't any field that can be changed. But as an example ;)

    @Column(name = "total_memory", updatable = false, nullable = false)
    private final long totalMemory;

    @Column(name = "free_memory", updatable = false, nullable = false)
    private final long freeMemory;


    public Performance(long totalMemory, long freeMemory) {
        this.totalMemory = totalMemory;
        this.freeMemory = freeMemory;
    }
}
