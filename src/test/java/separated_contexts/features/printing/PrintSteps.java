package separated_contexts.features.printing;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Quand;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import separated_contexts.printing.print_something.Printer;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class PrintSteps {
    @Autowired
    Printer printer;
    @Autowired
    OutputStream outputStream;

    @Quand("l’affichage de {string} est fait")
    public void l_affichage_de_est_fait(String printed) {
        printer.print(printed);
    }

    @Alors("{string} est affiché")
    public void est_affiché(String printed) {
        try {
            Mockito.verify(outputStream).write(printed.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
