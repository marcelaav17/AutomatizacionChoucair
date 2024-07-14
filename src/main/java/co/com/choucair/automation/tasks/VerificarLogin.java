package co.com.choucair.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automation.userinterface.orangeHrmLivePage.*;

public class VerificarLogin implements Task {
    private final String username;
    private final String password;

    public VerificarLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static VerificarLogin conCredenciales(String username, String password) {
        return new VerificarLogin(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(IMP_USER_NAME),
                Enter.theValue(password).into(IMP_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
}