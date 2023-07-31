package com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.userinterface.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RegistrarCuenta implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CATEGORIA, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(CATEGORIA),
                Click.on(MI_CUENTA),
                Click.on(REGISTRATE),
                Click.on(BOTON_CREAR_CUENTA)
        );
    }

    public static Performable inDafiti(){
        return instrumented(RegistrarCuenta.class);
    }
}
