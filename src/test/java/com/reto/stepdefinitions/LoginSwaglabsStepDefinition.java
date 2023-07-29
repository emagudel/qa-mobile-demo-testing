package com.reto.stepdefinitions;

import com.reto.exceptions.LoginIsNotCompleteException;
import com.reto.questions.LoginSwaglabs;
import com.reto.tasks.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.reto.exceptions.LoginIsNotCompleteException.LOGIN_FAIL_MESSAGE_EXCEPTION;
import static com.reto.userinterface.ProductsPage.LBL_PRODUCTS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSwaglabsStepDefinition {

    @When("{word} types his credentials on SwagLabs app")
    public void actorLoginIntoApp(String actor) {
        theActorCalled(actor).attemptsTo(Login.inSwaglabs());
    }

    @Then("He should see the product page")
    public void actorShouldSeeProductsTitle() {
        theActorInTheSpotlight().should(seeThat(
                LoginSwaglabs.isSuccesfully())
                .orComplainWith(LoginIsNotCompleteException.class,LOGIN_FAIL_MESSAGE_EXCEPTION )
        );
    }

    @Then("He ensure that is on product page")
    public void actorShouldSeeProductPage() {
        withCurrentActor(Ensure.that(LBL_PRODUCTS).isDisplayed());
    }
}