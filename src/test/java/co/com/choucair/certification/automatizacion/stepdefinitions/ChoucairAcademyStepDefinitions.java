package co.com.choucair.certification.automatizacion.stepdefinitions;

import co.com.choucair.certification.automatizacion.model.DataPassword;
import co.com.choucair.certification.automatizacion.model.DataPersonalUser;
import co.com.choucair.certification.automatizacion.model.DataUserDevices;
import co.com.choucair.certification.automatizacion.model.DataUserLocation;
import co.com.choucair.certification.automatizacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^you want to create an user in Utest page$")
    public void youWantToCreateAnUserInUtestPage() throws Exception {
        OnStage.theActorCalled("User").wasAbleTo(Launch.utestHomepage());
    }
    @Then("^go to the botton join today$")
    public void goToTheBottonJoinToday() throws Exception {
        OnStage.theActorCalled("User").wasAbleTo(Go.joinToday());
    }
    @When("^enters your personal information$")
    public void entersYourPersonalInformation(List<DataPersonalUser> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterUserData.information(
                data.get(0).getFistName(),
                data.get(0).getLastName(),
                data.get(0).getEmail(),
                data.get(0).getDay(),
                data.get(0).getMoth(),
                data.get(0).getYear(),
                data.get(0).getSpoken()
        ));
    }
    @And("^enter your personal location$")
    public void enterYourPersonalLocation(List<DataUserLocation> data) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(EnterUserLocation.information(
                data.get(0).getCity(),
                data.get(0).getState(),
                data.get(0).getPostalCode(),
                data.get(0).getCountry()
        ));

    }
    @And("^enter yours personal divices$")
    public void enterYoursPersonalDivices(List<DataUserDevices> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterUserDevices.information(
                data.get(0).getsOComputer(),
                data.get(0).getVersion(),
                data.get(0).getLanguague(),
                data.get(0).getMobile(),
                data.get(0).getModelo(),
                data.get(0).getSysOp()
        ));
    }
    @And("^create your password$")
    public void createYourPassword(List<DataPassword> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CreatePassword.information(data.get(0).getPassword()));
    }
    @And("^agree with terms and conditions$")
    public void agreeWithTermsAndConditions() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(AgreeTerms.information());
    }
    @Then("^your user will be create$")
    public void yourUserWillBeCreate() throws Exception {

    }
}
