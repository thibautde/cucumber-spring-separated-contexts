package separated_contexts.features.reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "separated_contexts.features.reporting",
        features = "classpath:separated_contexts/features/reporting")
public class RunReportCucumberTests {

    @CucumberContextConfiguration
    @SpringBootTest(classes = ReportingSpringTestConfig.class)
    public static class CucumberSpringReporting {

    }
}
