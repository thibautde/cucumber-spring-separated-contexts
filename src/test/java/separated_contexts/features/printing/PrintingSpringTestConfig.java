package separated_contexts.features.printing;

import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.io.OutputStream;

@TestConfiguration
public class PrintingSpringTestConfig {

    @Bean
    @Primary
    public OutputStream outputStream() {
       return Mockito.mock(OutputStream.class);
    }
}
