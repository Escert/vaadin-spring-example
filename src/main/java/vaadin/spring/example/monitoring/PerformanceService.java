package vaadin.spring.example.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PerformanceService {

    @Autowired
    private PerformanceRepository performanceRepository;

    public Performance create(long totalMemory, long freeMemory) {
        Performance performance = new Performance(totalMemory, freeMemory);

        return performanceRepository.save(performance);
    }
}
