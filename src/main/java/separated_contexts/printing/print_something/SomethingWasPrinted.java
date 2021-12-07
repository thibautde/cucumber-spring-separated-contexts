package separated_contexts.printing.print_something;

import org.springframework.lang.NonNull;
import separated_contexts.Event;

public class SomethingWasPrinted implements Event {
    private final String printed;

    public String getPrinted() {
        return printed;
    }

    public SomethingWasPrinted(@NonNull String printed) {
        this.printed = printed;
    }
}
