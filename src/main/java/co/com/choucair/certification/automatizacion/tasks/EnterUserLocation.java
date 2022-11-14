package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.InformationUserData;
import co.com.choucair.certification.automatizacion.userinterface.InformationUserLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.thucydides.core.webdriver.jquery.ByJQuery;
import org.openqa.selenium.Keys;

public class EnterUserLocation implements Task {

    public static Performable information() {
        return Tasks.instrumented(EnterUserLocation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(InformationUserLocation.CITY),
                Enter.theValue("Ibague Tolima").into(InformationUserLocation.CITY),
                Enter.keyValues(Keys.DOWN).into(InformationUserLocation.CITY),
                Enter.keyValues(Keys.ENTER).into(InformationUserLocation.CITY),
                Enter.theValue("730001").into(InformationUserLocation.POSTAL_CODE),
                Click.on(InformationUserLocation.COUNTRY_1),
                Enter.theValue("Colombia").into(InformationUserLocation.COUNTRY_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserLocation.COUNTRY_2),
                Click.on(InformationUserLocation.NEXT)

        );

    }
}
