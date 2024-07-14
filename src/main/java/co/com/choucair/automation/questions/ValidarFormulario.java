package co.com.choucair.automation.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static co.com.choucair.automation.userinterface.InformacionFormulario.*;

public class ValidarFormulario implements Question<Boolean> {

    private final String nombreEsperado;
    private final String apellidoEsperado;
    private final String emailEsperado;

    public ValidarFormulario(String nombreEsperado, String apellidoEsperado, String emailEsperado) {
        this.nombreEsperado = nombreEsperado;
        this.apellidoEsperado = apellidoEsperado;
        this.emailEsperado = emailEsperado;
    }

    public static ValidarFormulario es(String nombreEsperado, String apellidoEsperado, String emailEsperado) {
        return new ValidarFormulario(nombreEsperado, apellidoEsperado, emailEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        WebElement elementoNombre = INP_NOMBRE.resolveFor(actor);
        WebElement elementoApellido = INP_APELLIDO.resolveFor(actor);
        WebElement elementoEmail = INP_EMAIL.resolveFor(actor);

        String nombreActual = elementoNombre.getAttribute("value");
        String apellidoActual = elementoApellido.getAttribute("value");
        String emailActual = elementoEmail.getAttribute("value");

        return nombreActual.equals(nombreEsperado) &&
                apellidoActual.equals(apellidoEsperado) &&
                emailActual.equals(emailEsperado);
    }
    }



