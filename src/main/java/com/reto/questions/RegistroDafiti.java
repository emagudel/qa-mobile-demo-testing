package com.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.reto.userinterface.RegistroPage.LABEL_REGISTRO;

public class RegistroDafiti implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LABEL_REGISTRO.resolveFor(actor).isVisible();
    }

    public static RegistroDafiti isSuccesfully(){
        return new RegistroDafiti();
    }
}
