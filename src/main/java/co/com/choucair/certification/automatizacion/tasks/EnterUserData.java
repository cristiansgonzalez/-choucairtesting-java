package co.com.choucair.certification.automatizacion.tasks;

import co.com.choucair.certification.automatizacion.userinterface.InformationUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class EnterUserData implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String day;
    private String moth;
    private String year;
    private String spoken;

    public EnterUserData(String firstName, String lastName, String email, String day, String moth, String year, String spoken) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.day = day;
        this.moth = moth;
        this.year = year;
        this.spoken = spoken;
    }

    public static Performable information(String firstName, String lastName, String email, String day, String moth, String year, String spoken) {
        return Tasks.instrumented(EnterUserData.class, firstName, lastName, email, day, moth, year, spoken);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(InformationUserData.INPUT_NAME),
                Enter.theValue(lastName).into(InformationUserData.INPUT_LAST_NAME),
                Enter.theValue(email).into(InformationUserData.INPUT_EMAIL),
                SelectFromOptions.byValue("number:" + moth).from(InformationUserData.INPUT_MOTH),
                SelectFromOptions.byValue("number:" + day).from(InformationUserData.INPUT_DAY),
                SelectFromOptions.byValue("number:" + year).from(InformationUserData.INPUT_YEAR),
                Click.on(InformationUserData.SPOKEN),
                Enter.theValue(spoken).into(InformationUserData.SPOKEN),
                Enter.keyValues(Keys.ENTER).into(InformationUserData.SPOKEN),
                Click.on(InformationUserData.NEXT)
        );
    }
}
