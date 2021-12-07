package separated_contexts.reporting.make_report;

import org.springframework.context.event.EventListener;
import separated_contexts.printing.print_something.SomethingWasPrinted;

public class ReportMaker implements ReportService {

    private final ReportTemplateRepository reportTemplateRepository;

    public ReportMaker(ReportTemplateRepository reportTemplateRepository) {
        this.reportTemplateRepository = reportTemplateRepository;
    }

    @Override
    @EventListener
    public String report(SomethingWasPrinted event) {
        String template = reportTemplateRepository.getTemplate();
        final String report = String.format(template, event.getPrinted());
        System.out.println(report);
        return report;
    }
}
