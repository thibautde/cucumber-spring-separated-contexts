package separated_contexts.features.reporting;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@ConfigurationParameter(
    key = GLUE_PROPERTY_NAME,
    value = "separated_contexts.features.reporting")
@SelectClasspathResource("separated_contexts/features/reporting")
@CucumberContextConfiguration
@SpringBootTest(classes = ReportingSpringTestConfig.class)
public class RunReportCucumberTests {
}
