package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.Password;
import co.com.choucair.certification.automatizacion.util.PasswordGeneration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class CreatePassword implements Task {

    public static Performable information(String password) {
        return Tasks.instrumented(CreatePassword.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String password2 = PasswordGeneration.passwordGeneration(60);
        actor.attemptsTo(Enter.theValue(password2).into(Password.PASSWORD),
                Enter.theValue(password2).into(Password.CONFIRM_PASSWORD)
                );
    }
}
