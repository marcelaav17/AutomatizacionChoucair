package co.com.choucair.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

import static co.com.choucair.automation.userinterface.orangeHrmLivePage.MENSAJE;


public class ValidarDatosEnLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement mensajeElement = MENSAJE.resolveFor(actor);
        return mensajeElement.isDisplayed();
    }

    public static ValidarDatosEnLogin message() {
        return new ValidarDatosEnLogin();
    }
}
