package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.InformationUserDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class EnterUserDevices implements Task {

    public static Performable information() {
        return Tasks.instrumented(EnterUserDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InformationUserDevices.COMPUTER_1),
                Enter.theValue("Windows").into(InformationUserDevices.COMPUTER_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.COMPUTER_2),
                Click.on(InformationUserDevices.VERSION_1),
                Enter.theValue("Windows 10").into(InformationUserDevices.VERSION_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.VERSION_2),
                Click.on(InformationUserDevices.LANGUAGUE_1),
                Enter.theValue("Spanish").into(InformationUserDevices.LANGUAGUE_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.LANGUAGUE_2),
                Click.on(InformationUserDevices.MOBILE_1),
                Enter.theValue("Apple").into(InformationUserDevices.MOBILE_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.MOBILE_2),
                Click.on(InformationUserDevices.MODEL_1),
                Enter.theValue("iPhone 14 Pro Max").into(InformationUserDevices.MODEL_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.MODEL_2),
                Click.on(InformationUserDevices.OP_SYS_1),
                Enter.theValue("iOS 16.1 Beta").into(InformationUserDevices.OP_SYS_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.OP_SYS_2),
                Click.on(InformationUserDevices.NEXT)
                );
    }
}
