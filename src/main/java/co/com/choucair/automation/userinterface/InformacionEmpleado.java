package co.com.choucair.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class InformacionEmpleado {
    public static final Target INP_BUSCAR = Target.the("Buscar palabra clave ").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/input"));
    public static final Target BTN_BUSCAR = Target.the("Buscar emoleado").located(org.openqa.selenium.By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]"));
    public static final Target BTN_INSPECCIONAR = Target.the("ver informacion del empleado").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[7]/div/button[1]/i"));
}
