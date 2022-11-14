package co.com.choucair.certification.automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Password extends PageObject {
    public static final Target PASSWORD = Target.the("Ingresa la contraseña")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target CONFIRM_PASSWORD = Target.the("Ingresa la confirmacion de la contraseña")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target STAY_INFORMED = Target.the("STAY INFORMED!")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target TERMS_USE = Target.the("erminos de uso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY = Target.the("Privacidad")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target CREATRE_USER = Target.the("Creacion de usuario")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));
}
