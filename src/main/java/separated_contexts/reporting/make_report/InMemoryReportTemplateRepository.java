package separated_contexts.reporting.make_report;

public class InMemoryReportTemplateRepository implements ReportTemplateRepository {
    @Override
    public String getTemplate() {
        return "Message '%s' was printed.";
    }
}
