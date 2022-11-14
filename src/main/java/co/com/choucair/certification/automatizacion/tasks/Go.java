package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.SingUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Go implements Task {
    public static Performable joinToday() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SingUp.JOIN_TODAY_BUTTON));
    }
}
