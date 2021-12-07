package separated_contexts.features.reporting;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etque;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Étantdonnéque;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import separated_contexts.printing.print_something.SomethingWasPrinted;
import separated_contexts.reporting.make_report.ReportService;
import separated_contexts.reporting.make_report.ReportTemplateRepository;

public class ReportSteps {

    @Autowired
    ReportService reportService;
    @Autowired
    ReportTemplateRepository reportTemplateRepository;

    private String message;
    private String report;

    @Étantdonnéque("{string} a été affiché")
    public void a_été_affiché(String message) {
        this.message = message;
    }

    @Etque("le template est {string}")
    public void le_template_est(String template) {
        Mockito.when(reportTemplateRepository.getTemplate()).thenReturn(template);
    }

    @Quand("le rapport est fait")
    public void le_rapport_est_fait() {
        report = reportService.report(new SomethingWasPrinted(message));
    }

    @Alors("le rapport contient {string}")
    public void le_rapport_contient_mon_message(String content) {
        Assertions.assertEquals(content, report);
    }
}
