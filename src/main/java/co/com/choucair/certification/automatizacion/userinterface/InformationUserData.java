package co.com.choucair.certification.automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformationUserData extends PageObject {
    public static final Target INPUT_NAME = Target.the("Ingresa el nombre")
            .located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LAST_NAME = Target.the("Ingresa el apellido")
            .located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_EMAIL = Target.the("Ingresa el correo electronico")
            .located(By.xpath("//*[@id=\"email\"]"));
    public static final Target INPUT_MOTH = Target.the("Ingresa el mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Ingresa el dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Ingresa el año de nacimiento")
            .located(By.id("birthYear"));
    public static final Target NEXT = Target.the("Pasa al formulario 2")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target SPOKEN = Target.the("spoken")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
}
