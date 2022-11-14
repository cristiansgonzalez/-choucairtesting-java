package co.com.choucair.certification.automatizacion.tasks;


import co.com.choucair.certification.automatizacion.userinterface.Utest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Launch implements Task {
    private Utest utest;

    public static Performable utestHomepage() {
        return Tasks.instrumented(Launch.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utest));
    }
}
