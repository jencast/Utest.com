package com.utest.tasks;

import com.utest.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegisterStep3 implements Task {

    private String strComputer;
    private String strVersionfield;
    private String strLanguagefield;

    public RegisterStep3(String strComputer, String strVersionfield, String strLanguagefield) {
        this.strComputer = strComputer;
        this.strVersionfield = strVersionfield;
        this.strLanguagefield = strLanguagefield;
    }

    public static RegisterStep3 the(String strComputer, String strVersionfield, String strLanguagefield) {
        return Tasks.instrumented(RegisterStep3.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(UtestRegisterPage.INPUT_COMPUTER_lIST.waitingForNoMoreThan(Duration.ofSeconds(20)),
                Click.on(UtestRegisterPage.INPUT_COMPUTER_lIST),
                Click.on(UtestRegisterPage.INPUT_COMPUTER),
                Click.on(UtestRegisterPage.INPUT_VERSION_LIST),
                Click.on(UtestRegisterPage.INPUT_VERSION),
                Click.on(UtestRegisterPage.INPUT_LENGUAGEFIELD_LIST),
                Click.on(UtestRegisterPage.INPUT_LENGUAGEFIELD),
                Click.on(UtestRegisterPage.LASTSTEP_BUTTON)
        );
    }
}
