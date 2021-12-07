package separated_contexts.reporting.make_report;

import separated_contexts.printing.print_something.SomethingWasPrinted;

public interface ReportService {
    String report(SomethingWasPrinted event);
}
