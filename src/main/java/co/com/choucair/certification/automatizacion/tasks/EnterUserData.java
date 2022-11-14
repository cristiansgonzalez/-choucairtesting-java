package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.InformationUserData;
import co.com.choucair.certification.automatizacion.userinterface.InformationUserDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class EnterUserData implements Task {
    public static Performable information() {
        return Tasks.instrumented(EnterUserData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Cristian").into(InformationUserData.INPUT_NAME),
                Enter.theValue("Gonzalez").into(InformationUserData.INPUT_LAST_NAME),
                Enter.theValue("cristian-saul-66@hotmail.com").into(InformationUserData.INPUT_EMAIL),
                SelectFromOptions.byValue("number:6").from(InformationUserData.INPUT_MOTH),
                SelectFromOptions.byValue("number:13").from(InformationUserData.INPUT_DAY),
                SelectFromOptions.byValue("number:1991").from(InformationUserData.INPUT_YEAR),
                Click.on(InformationUserData.SPOKEN),
                Enter.theValue("Spanish").into(InformationUserData.SPOKEN),
                Enter.keyValues(Keys.ENTER).into(InformationUserData.SPOKEN),
                Click.on(InformationUserData.NEXT)
        );
    }
}
