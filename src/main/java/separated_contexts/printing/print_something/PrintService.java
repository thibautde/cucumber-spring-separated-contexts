package separated_contexts.printing.print_something;

import org.springframework.context.ApplicationEventPublisher;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class PrintService implements Printer {

    private final ApplicationEventPublisher applicationEventPublisher;
    private final OutputStream outputStream;

    public PrintService(ApplicationEventPublisher applicationEventPublisher,
                        OutputStream outputStream) {
        this.applicationEventPublisher = applicationEventPublisher;
        this.outputStream = outputStream;
    }

    @Override
    public void print(String printed) {
        try {
            outputStream.write(printed.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        applicationEventPublisher.publishEvent(new SomethingWasPrinted(printed));
    }

}
