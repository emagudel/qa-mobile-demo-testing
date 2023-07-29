package com.reto.stepdefinitions;

import com.reto.exceptions.QuantityProductsNotEqualException;
import com.reto.questions.QuantityProducts;
import com.reto.tasks.AddProduct;
import com.reto.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.reto.exceptions.QuantityProductsNotEqualException.CANTIDAD_NO_CORRRESPONDE_EXCEPTION_MESSAGE;
import static com.reto.userinterface.CartShoppingPage.BTN_CART;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyingProductsStepDefinition {

    @Given("that {word} signed-in SwagLabs app")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(Login.inSwaglabs());
    }

    @When("He puts in the cart the {string}")
    public void actorPutShirtCart(String nameProduct) {
        theActorInTheSpotlight().attemptsTo(AddProduct.toTheCart(nameProduct));
    }
    @Then("He should see that he has {word} product on the cart")
    public void actorShouldSeeQuantityProduct(String cantProducts) {
        theActorInTheSpotlight()
                .should(seeThat(
                        QuantityProducts.itsEqual(cantProducts))
                        .orComplainWith(QuantityProductsNotEqualException.class, CANTIDAD_NO_CORRRESPONDE_EXCEPTION_MESSAGE));
    }

    @Then("He ensure that there is {word} product on the cart")
    public void actorShouldSeeProductsCart(String cantProducts) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(BTN_CART).text().contains(cantProducts));
    }
}