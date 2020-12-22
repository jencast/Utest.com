package com.utest.stepdefinitions;

import com.utest.model.UtestData;
import com.utest.questions.Answer;
import com.utest.tasks.*;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterUtestStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast()); }

    @Given("^She is on the webside$")
    public void sheIsOnTheWebside() {
        OnStage.theActorCalled("Bibiana").wasAbleTo(OpenUp.thePage());
    }


    @When("^she fills in the data of the first form$")
    public void sheFillsInTheDataOfTheFirstForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStep1.the(utestData.get(0).getStrName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmail(),
                utestData.get(0).getStrDateBirthmouth(),
                utestData.get(0).getStrDateBirthday(),
                utestData.get(0).getStrDateBirthyear()));
    }

    @When("^she fills in the data of the second form$")
    public void sheFillsInTheDataOfTheSecondForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStep2.the(utestData.get(0).getStrCityfield(),
                utestData.get(0).getStrZiporPostalCodefield(),
                utestData.get(0).getStrCountry()));
    }

    @When("^she fills in the data of the third form$")
    public void sheFillsInTheDataOfTheThirdForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStep3.the(utestData.get(0).getStrComputer(),
                utestData.get(0).getStrVersionfield(),
                utestData.get(0).getStrLanguagefield()));
    }

    @When("^she fills in the data of the fourth form$")
    public void sheFillsInTheDataOfTheFourthForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStep4.the(utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPassword()));

    }

    @Then("^Bibiana will see this successful registration message (.*)$")
    public void bibianaWillSeeThisSuccessfulRegistrationMessageWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
