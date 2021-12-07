package separated_contexts.printing;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import separated_contexts.printing.print_something.PrintService;
import separated_contexts.printing.print_something.Printer;

import java.io.OutputStream;

@Configuration
public class PrintingSpringConfig {

    @Bean
    public OutputStream outputStream() {
        return System.out;
    }

    @Bean
    public Printer printer(ApplicationEventPublisher applicationEventPublisher,
                           OutputStream outputStream) {
        return new PrintService(applicationEventPublisher, outputStream);
    }
}
