package separated_contexts.features.printing;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "separated_contexts.features.printing",
        features = "classpath:separated_contexts/features/printing")
public class RunPrintingCucumberTests {

    @CucumberContextConfiguration
    @SpringBootTest(classes = PrintingSpringTestConfig.class)
    public static class CucumberSpringPrinting {

    }
}
