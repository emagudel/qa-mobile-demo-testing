package com.reto.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class RegistroPage {
    public static final Target TXT_USER = the("Input Username")
            .locatedForAndroid(MobileBy.AccessibilityId("test-Username"))
            .locatedForIOS(MobileBy.iOSNsPredicateString("name == 'test-Username'"));

    public static final Target TXT_PASSWORD = the("Input Password")
            .locatedForAndroid(MobileBy.AccessibilityId("test-Password"))
            .locatedForIOS(MobileBy.iOSClassChain("**/XCUIElementTypeSecureTextField[`name == 'test-Password'`]"));

    public static final Target BTN_LOGIN = the("Button Login")
            .locatedForAndroid(MobileBy.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"))
            .locatedForIOS(MobileBy.AccessibilityId("test-LOGIN"));


    public static final Target CATEGORIA = the("Categorias")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Masculino']"))
            .locatedForIOS(MobileBy.id("Ios"));
    public static final Target MI_CUENTA = the("Mi cuenta")
            .locatedForAndroid(MobileBy.xpath("//android.widget.TextView[@text='Mi Cuenta']"))
            .locatedForIOS(MobileBy.id("Ios"));
    public static final Target REGISTRATE = the("Registrate")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/account_email"))
            .locatedForIOS(MobileBy.id("Ios"));
    public static final Target BOTON_CREAR_CUENTA = the("Boton crear cuenta")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/create_account"))
            .locatedForIOS(MobileBy.id("Ios"));
    public static final Target LABEL_REGISTRO = the("Label registro")
            .locatedForAndroid(MobileBy.id("br.com.dafiti:id/toolbar_title"))
            .locatedForIOS(MobileBy.id("Ios"));
}
