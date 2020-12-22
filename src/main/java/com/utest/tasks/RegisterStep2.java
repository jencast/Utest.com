package com.utest.tasks;

import com.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegisterStep2 implements Task {

    private String strCityfield;
    private String strZiporPostalCodefield;
    private String strCountry;

    public RegisterStep2(String strCityfield, String strZiporPostalCodefield, String strCountry) {
        this.strCityfield = strCityfield;
        this.strZiporPostalCodefield = strZiporPostalCodefield;
        this.strCountry = strCountry;
    }

    public static RegisterStep2 the(String strCityfield, String strZiporPostalCodefield, String strCountry) {
        return Tasks.instrumented(RegisterStep2.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCityfield).into(UtestRegisterPage.INPUT_CITY),
                Click.on(UtestRegisterPage.INPUT_CITY),
                Click.on(UtestRegisterPage.INPUT_CITY_LIST),
                Enter.theValue(strZiporPostalCodefield).into(UtestRegisterPage.INPUT_POSTALCODE),
                Click.on(UtestRegisterPage.INPUT_COUNTRY_LIST),
                //WaitUntil.the(UtestRegisterPage.INPUT_COUNTRY.waitingForNoMoreThan(Duration.ofSeconds()),
                Click.on(strCountry),
                Click.on(UtestRegisterPage.NEXTDEVICES_BUTTON)

                );
    }
}
