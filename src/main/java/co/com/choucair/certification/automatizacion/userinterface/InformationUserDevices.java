package co.com.choucair.certification.automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformationUserDevices extends PageObject {
    public static final Target COMPUTER_1 = Target.the("Selecciona la casilla computador")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_2 = Target.the("Ingresa el sistema operativo")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target VERSION_1 = Target.the("Selecciona la casilla de la version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target VERSION_2 = Target.the("Ingresa la version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target LANGUAGUE_1 = Target.the("Selecciona la casilla del lenguaje")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LANGUAGUE_2 = Target.the("Ingresa el lenguaje")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_1 = Target.the("Selecciona la casilla del celular")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_2 = Target.the("Ingresa la marca del celular")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MODEL_1 = Target.the("Selecciona la casilla del modelo celular")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MODEL_2 = Target.the("Ingresa el modelo del celular")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OP_SYS_1 = Target.the("Selecciona la casilla del sistema operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target OP_SYS_2 = Target.the("Ingresa el sistema operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT = Target.the("Pasa al formulario 4")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
