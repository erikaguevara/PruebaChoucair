package co.com.choucair.certification.PruebaErikaGuevara.stepdefinitions;

import co.com.choucair.certification.PruebaErikaGuevara.model.UTestFinalData;
import co.com.choucair.certification.PruebaErikaGuevara.tasks.Login;
import co.com.choucair.certification.PruebaErikaGuevara.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Erika desea registrarse en utest$")
    public void ErikaDeseaRegistrarseEnUtest(List<UTestFinalData> uTestFinalData) throws Exception {
        OnStage.theActorCalled("Erika").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(uTestFinalData.get(0).getStrName(),uTestFinalData.get(0).getStrLastName(),uTestFinalData.get(0).getStrEmail()));

    }
    @When("^Ella desea ingresar a la plataforma para registrarse$")
    public void EllaDeseaIngresarALaPlataformaParaRegistrarse(List<UTestFinalData> uTestFinalData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Login.
                onThePage(uTestFinalData.get(0).getStrName(),uTestFinalData.get(0).getStrLastName(),uTestFinalData.get(0).getStrEmail()));
      //  throw new PendingException();
    }

    @Then("^Ella termino de registrarse$")
    public void EllaTerminoDeRegistrarse(List<UTestFinalData> uTestFinalData) throws  Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Login.
                onThePage(uTestFinalData.get(0).getStrName(),uTestFinalData.get(0).getStrLastName(),uTestFinalData.get(0).getStrEmail()));
       // throw new PendingException();
    }
}
