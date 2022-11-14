package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.Password;
import co.com.choucair.certification.automatizacion.util.PasswordGeneration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterPassword implements Task {
    public static Performable information() {
        return Tasks.instrumented(EnterPassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String password = PasswordGeneration.passwordGeneration(60);
        actor.attemptsTo(Enter.theValue(password).into(Password.PASSWORD),
                Enter.theValue(password).into(Password.CONFIRM_PASSWORD),
                Click.on(Password.STAY_INFORMED),
                Click.on(Password.TERMS_USE),
                Click.on(Password.PRIVACY),
                Click.on(Password.CREATRE_USER)
                );
    }
}
