package vaadin.spring.example.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PerformanceJob {

    @Autowired
    private PerformanceService performanceService;


    @Scheduled(initialDelayString = "PT30S", fixedDelayString = "PT1M")
    public void trackCurrentPerformance() {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();

        performanceService.create(totalMemory, freeMemory);
    }
}
