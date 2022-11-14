package co.com.choucair.certification.automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Password extends PageObject {
    public static final Target PASSWORD = Target.the("Ingresa la contraseña")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target CONFIRM_PASSWORD = Target.the("Ingresa la confirmacion de la contraseña")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));
}
