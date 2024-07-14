package co.com.choucair.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

import static co.com.choucair.automation.userinterface.ContratacionPage.MENSAJE_CONT;


public class ValidarContratacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement mensajeElement = MENSAJE_CONT.resolveFor(actor);
        return mensajeElement.isDisplayed();
    }

    public static ValidarContratacion message() {
        return new ValidarContratacion();
    }
}
