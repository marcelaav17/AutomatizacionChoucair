package co.com.choucair.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.automation.userinterface.ContratacionPage.*;
import static co.com.choucair.automation.userinterface.orangeHrmLivePage.*;

public class VerificarContratacion implements Task {
    private final String firtsName;
    private final String lastName;
    private final String email;
    private final String palabra;

    public VerificarContratacion(String firtsName, String lastName, String email, String palabra) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.palabra = palabra;
    }

    public static VerificarContratacion conDatos(String firtsName, String lastName, String email, String palabra) {
        return new VerificarContratacion(firtsName, lastName, email, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_RECRUITMENT),
                Click.on(BTN_ADD),
                Enter.theValue(firtsName).into(INP_FIRSTNAME),
                Enter.theValue(lastName).into(INP_LASTNAME),
                Enter.theValue(email).into(INP_EMAIL),
                Enter.theValue(palabra).into(INP_CLAVE),
                Click.on(BTN_SAVE)

        );
    }
}