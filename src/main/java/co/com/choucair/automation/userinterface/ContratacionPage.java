package co.com.choucair.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class ContratacionPage {
    public static final Target BTN_RECRUITMENT = Target.the("Boton para dirigirse a el proceso de contratación").located(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
    public static final Target BTN_ADD = Target.the("boton para agregar").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
    public static final Target INP_FIRSTNAME = Target.the("imput para el nombre").located(By.xpath("//input[@name='firstName']"));
    public static final Target INP_LASTNAME = Target.the("imput para el apellido").located(By.xpath("//input[@name='lastName']"));
    public static final Target INP_EMAIL = Target.the("imput para el correo").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
    public static final Target BTN_SAVE = Target.the("boton para guardar").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));
    public static final Target MENSAJE_CONT = Target.the("mensaje").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/h6"));
    public static final Target INP_CLAVE = Target.the("palabra clave").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input"));
}
