package co.com.choucair.certification.PruebaErikaGuevara.stepdefinitions;

import co.com.choucair.certification.PruebaErikaGuevara.model.AcademyChoucairData;
import co.com.choucair.certification.PruebaErikaGuevara.questions.Answer;
import co.com.choucair.certification.PruebaErikaGuevara.tasks.Login;
import co.com.choucair.certification.PruebaErikaGuevara.tasks.OpenUp;
import co.com.choucair.certification.PruebaErikaGuevara.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than  Rose want to learn automation at the Academy Choucair$")
    public void thanRoseWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }
    @When("^she search for the course on the choucair academy platform$")
    public void sheSearchForTheCourseCursosYCertificacionesOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
            throws Exception {
            OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }
    @Then("^she finds the course called resources$")
    public void sheFindsTheCourseCalledFoundationLevelOnline2018(List<AcademyChoucairData>academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }

}
