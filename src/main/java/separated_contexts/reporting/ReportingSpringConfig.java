package separated_contexts.reporting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import separated_contexts.reporting.make_report.InMemoryReportTemplateRepository;
import separated_contexts.reporting.make_report.ReportMaker;
import separated_contexts.reporting.make_report.ReportService;
import separated_contexts.reporting.make_report.ReportTemplateRepository;

@Configuration
public class ReportingSpringConfig {

    @Bean
    public ReportTemplateRepository reportTemplateRepository() {
        return new InMemoryReportTemplateRepository();
    }

    @Bean
    public ReportService reportService(ReportTemplateRepository reportTemplateRepository) {
        return new ReportMaker(reportTemplateRepository);
    }
}
