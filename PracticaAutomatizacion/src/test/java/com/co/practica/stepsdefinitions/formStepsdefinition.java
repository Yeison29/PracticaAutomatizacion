package com.co.practica.stepsdefinitions;

import com.co.practica.questions.FormAnswer;
import com.co.practica.tasks.FormFill;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class formStepsdefinition {
    @Managed
    WebDriver histBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Yeison");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(histBrowser));
    }

    @Given("Ingresar a la pagina")
    public void ingresarAlaPagina(){
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://bonigarcia.dev/selenium-webdriver-java/web-form.html"));
    }
    @When("Ingrese a la pagina deligenciar los campos")
    public void deligenciarCamposFormularios(){
        OnStage.theActorInTheSpotlight().attemptsTo(FormFill.enter());
    }
    @Then("Resgistro completo del formulario")
    public void registroCompletoFormulario(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FormAnswer.compare(), Matchers.equalTo("Received!")));
    }

}
