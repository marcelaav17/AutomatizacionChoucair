package co.com.choucair.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class InformacionFormulario {
    public static final Target INP_NOMBRE = Target.the("ver nombre del empleado").located(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname' and @disabled]"));
    public static final Target INP_APELLIDO = Target.the("ver apellido del empleado").located(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname' and @disabled]"));
    public static final Target INP_EMAIL = Target.the("ver email del empleado").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div/form/div[3]/div/div[1]/div/div[2]/input"));
}

