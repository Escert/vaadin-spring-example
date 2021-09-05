package vaadin.spring.example.monitoring;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import vaadin.spring.example.views.MainLayout;

@PageTitle("Performance")
@Route(value = "performance", layout = MainLayout.class)
public class PerformanceView extends HorizontalLayout {

    public PerformanceView() {

    }
}
