package co.com.choucair.certification.automatizacion.stepdefinitions;

import co.com.choucair.certification.automatizacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.concurrent.TimeUnit;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^user wants create the user in page Utest$")
    public void userWantsCreateTheUserInPageUtest() throws Exception {
        OnStage.theActorCalled("User").wasAbleTo(Launch.utestHomepage());
        OnStage.theActorCalled("User").wasAbleTo(Go.joinToday());
    }

    @When("^enters his personal data$")
    public void entersHisPersonalData() throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(EnterUserData.information());
        OnStage.theActorInTheSpotlight().attemptsTo(EnterUserLocation.information());
        OnStage.theActorInTheSpotlight().attemptsTo(EnterUserDevices.information());
        OnStage.theActorInTheSpotlight().attemptsTo(EnterPassword.information());
        TimeUnit.SECONDS.sleep(3);


    }

    @Then("^user create$")
    public void UserCreate() throws Exception {

    }

}
