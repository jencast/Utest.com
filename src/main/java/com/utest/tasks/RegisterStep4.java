package com.utest.tasks;

import com.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterStep4 implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public RegisterStep4(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static RegisterStep4 the(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(RegisterStep4.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestRegisterPage.CREATE_PASSWORD),
                Click.on(UtestRegisterPage.CONFIRM_PASSWORD),
                Click.on(UtestRegisterPage.READ_AND_ACCEPT_TERMS_OF_USED),
                Click.on(UtestRegisterPage.READ_AND_ACCEPT_PRIVACY_AND_SECURITY),
                Click.on(UtestRegisterPage.COMPLETE_SETUP_BUTTON)
        );
    }
}
