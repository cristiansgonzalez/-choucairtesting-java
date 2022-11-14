package co.com.choucair.certification.automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class InformationUserLocation extends PageObject {
    public static final Target CITY = Target.the("Ingresa La ciudad")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target POSTAL_CODE = Target.the("Ingresa el codigo postal")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target COUNTRY_1 = Target.the("Ingresa el pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY_2 = Target.the("Ingresa el pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT = Target.the("Pasa al formulario 3")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
