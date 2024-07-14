package co.com.choucair.automation.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static co.com.choucair.automation.userinterface.ContratacionPage.*;
import static co.com.choucair.automation.userinterface.InformacionEmpleado.*;

public class VerificarEmpleado implements Task {
    private final String Keywords;


    public VerificarEmpleado(String Keywords) {
        this.Keywords = Keywords;

    }

    public static VerificarEmpleado conDatos(String Keywords) {

        return new VerificarEmpleado(Keywords);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_RECRUITMENT),
                Enter.theValue(Keywords).into(INP_BUSCAR),
                Click.on(BTN_BUSCAR)
        );

        try {
            Thread.sleep(10000); // 10 segundos en milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(BTN_INSPECCIONAR)

        );


    }
}
