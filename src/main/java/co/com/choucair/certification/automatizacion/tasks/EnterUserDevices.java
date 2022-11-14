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

    private String sOComputer;
    private String version;
    private String languague;
    private String mobile;
    private String modelo;
    private String sysOp;

    public EnterUserDevices(String sOComputer, String version, String languague, String mobile, String modelo, String sysOp) {
        this.sOComputer = sOComputer;
        this.version = version;
        this.languague = languague;
        this.mobile = mobile;
        this.modelo = modelo;
        this.sysOp = sysOp;
    }

    public static Performable information(String sOComputer, String version, String languague, String mobile, String modelo, String sysOp) {
        return Tasks.instrumented(EnterUserDevices.class, sOComputer, version, languague, mobile, modelo, sysOp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InformationUserDevices.COMPUTER_1),
                Enter.theValue(sOComputer).into(InformationUserDevices.COMPUTER_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.COMPUTER_2),
                Click.on(InformationUserDevices.VERSION_1),
                Enter.theValue(version).into(InformationUserDevices.VERSION_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.VERSION_2),
                Click.on(InformationUserDevices.LANGUAGUE_1),
                Enter.theValue(languague).into(InformationUserDevices.LANGUAGUE_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.LANGUAGUE_2),
                Click.on(InformationUserDevices.MOBILE_1),
                Enter.theValue(mobile).into(InformationUserDevices.MOBILE_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.MOBILE_2),
                Click.on(InformationUserDevices.MODEL_1),
                Enter.theValue(modelo).into(InformationUserDevices.MODEL_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.MODEL_2),
                Click.on(InformationUserDevices.OP_SYS_1),
                Enter.theValue(sysOp).into(InformationUserDevices.OP_SYS_2),
                Enter.keyValues(Keys.ENTER).into(InformationUserDevices.OP_SYS_2),
                Click.on(InformationUserDevices.NEXT)
                );
    }
}
