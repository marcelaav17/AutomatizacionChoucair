package co.com.choucair.automation.userinterface;

import net.thucydides.core.annotations.findby.By;

import net.serenitybdd.screenplay.targets.Target;

public class orangeHrmLivePage {
     public static final Target IMP_USER_NAME = Target.the("imput login user name").located(By.xpath("//input[@name='username' and contains(@class, 'oxd-input')]"));
     public static final Target IMP_PASSWORD = Target.the("imput login password").located(By.xpath("//input[@type='password' and @name='password' and contains(@class, 'oxd-input')]"));
     public static final Target BTN_LOGIN = Target.the("boton de login").located(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
     public static final Target MENSAJE = Target.the("mensaje").located(By.xpath("//*[text()='Time at Work']"));
}