package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.TermsConditions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgreeTerms implements Task {
    public static Performable information() {
        return Tasks.instrumented(AgreeTerms.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TermsConditions.STAY_INFORMED),
                Click.on(TermsConditions.TERMS_USE),
                Click.on(TermsConditions.PRIVACY),
                Click.on(TermsConditions.CREATRE_USER));
    }
}
