package com.reto.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CartShoppingPage {
    public static final Target BTN_CART = the("Carrito").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.TextView"));
}
