package separated_contexts.features.reporting;

import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import separated_contexts.reporting.make_report.ReportTemplateRepository;

@TestConfiguration
public class ReportingSpringTestConfig {

    @Bean
    @Primary
    public ReportTemplateRepository reportTemplateRepository() {
        return Mockito.mock(ReportTemplateRepository.class);
    }

}
