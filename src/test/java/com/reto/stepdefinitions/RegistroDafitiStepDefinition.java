package com.reto.stepdefinitions;

import com.reto.exceptions.LoginIsNotCompleteException;
import com.reto.questions.RegistroDafiti;
import com.reto.tasks.RegistrarCuenta;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.reto.exceptions.LoginIsNotCompleteException.REGISTRO_FAIL_MESSAGE_EXCEPTION;
import static com.reto.userinterface.RegistroPage.LABEL_REGISTRO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroDafitiStepDefinition {

    @When("{word} enters the Create Account functionality in the Dafiti application")
    public void actorLoginIntoApp(String actor) {
        theActorCalled(actor).attemptsTo(RegistrarCuenta.inDafiti());
    }

    @Then("He should see the product page")
    public void actorShouldSeeProductsTitle() {
        theActorInTheSpotlight().should(seeThat(
                RegistroDafiti.isSuccesfully())
                .orComplainWith(LoginIsNotCompleteException.class, REGISTRO_FAIL_MESSAGE_EXCEPTION)
        );
    }

    @Then("He ensure that is on product page")
    public void actorShouldSeeProductPage() {
        withCurrentActor(Ensure.that(LABEL_REGISTRO).isDisplayed());
    }
}