package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.InformationUserLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class EnterUserLocation implements Task {
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public EnterUserLocation(String city, String state, String postalCode, String country) {
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public static Performable information(String city, String state, String postalCode, String country) {
        return Tasks.instrumented(EnterUserLocation.class, city, state, postalCode, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(InformationUserLocation.CITY),
                Enter.theValue(city + " " + state).into(InformationUserLocation.CITY),
                Enter.keyValues(Keys.DOWN).into(InformationUserLocation.CITY),
                Enter.keyValues(Keys.ENTER).into(InformationUserLocation.CITY),
                Enter.theValue(postalCode).into(InformationUserLocation.POSTAL_CODE),
                Click.on(InformationUserLocation.COUNTRY_1),
                Enter.theValue(country).into(InformationUserLocation.COUNTRY_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserLocation.COUNTRY_2),
                Click.on(InformationUserLocation.NEXT)
        );
    }
}
