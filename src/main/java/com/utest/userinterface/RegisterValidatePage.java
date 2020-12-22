package com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterValidatePage extends PageObject {
    public static final Target VALIDATION_MESSAGE = Target.the("extract the successful message from the log")
            .located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));
}
