package com.utest.tasks;

import com.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterStep1 implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strDateBirthmouth;
    private String strDateBirthday;
    private String strDateBirthyear;

    public RegisterStep1(String strName, String strLastName, String strEmail, String strDateBirthmouth, String strDateBirthday, String strDateBirthyear) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strDateBirthmouth = strDateBirthmouth;
        this.strDateBirthday = strDateBirthday;
        this.strDateBirthyear = strDateBirthyear;
    }

    public static RegisterStep1 the(String strName, String strLastName, String strEmail, String strDateBirthmouth, String strDateBirthday, String strDateBirthyear) {
        return Tasks.instrumented(RegisterStep1.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.JOINTODAY_BUTTON),
                Enter.theValue(strName).into(UtestRegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL),
                Click.on(UtestRegisterPage.BIRTHMOUNTH_LIST),
                Click.on(UtestRegisterPage.BIRTHMOUNTH),
                Click.on(UtestRegisterPage.BIRTHDAY_LIST),
                Click.on(UtestRegisterPage.BIRTHDAY),
                Click.on(UtestRegisterPage.BITHYEAR_LIST),
                Click.on(UtestRegisterPage.BITHYEAR),
                Click.on(UtestRegisterPage.NEXTLOCATION_BUTTON)
        );
    }
}
