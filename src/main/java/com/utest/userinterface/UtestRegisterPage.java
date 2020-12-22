package com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestRegisterPage extends PageObject {

    //REGISTER STEP 1

    public static final Target JOINTODAY_BUTTON = Target.the("button that shows us the form to register")
            .locatedBy("//*[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target INPUT_NAME= Target.the("where do we write the name")
            .locatedBy("//*[@id='firstName']");
    public static final Target INPUT_LASTNAME= Target.the("where do we write the lastname")
            .locatedBy("//*[@id='lastName']");
    public static final Target INPUT_EMAIL= Target.the("where do we write the email")
            .locatedBy("//*[@id='email']");
    public static final Target BIRTHMOUNTH_LIST= Target.the("shows us the list of months")
            .locatedBy("//*[@id='birthMonth']");
    public static final Target BIRTHMOUNTH= Target.the("chosen month")
            .locatedBy("//*[@id='birthMonth']/option[contains(text(),'{0}')]");
    public static final Target BIRTHDAY_LIST= Target.the("shows us the list of days")
            .locatedBy("//*[@id='birthDay']");
    public static final Target BIRTHDAY = Target.the("chosen day")
            .locatedBy("//*[@id='birthDay']/option[text()='{0}']");
    public static final Target BITHYEAR_LIST= Target.the("shows us the list of years")
            .locatedBy("//*[@id='birthYear']");
    public static final Target BITHYEAR = Target.the("chosen year")
            .locatedBy("//*[@id='birthYear']/option[text()='{0}']");
    public static final Target NEXTLOCATION_BUTTON = Target.the("button to go to the next section")
            .locatedBy("//*[@class='btn btn-blue']");

    //REGISTER STEP 2

    public static final Target INPUT_CITY= Target.the("where do we write the city")
            .locatedBy("//*[@id='city']");
    public static final Target INPUT_CITY_LIST= Target.the("shows us the list of cities")
            .locatedBy("//*[@class='pac-container pac-logo hdpi']/*[1]");
    public static final Target INPUT_POSTALCODE= Target.the("where do we write the postalcode")
            .locatedBy("//*[@id='zip']");
    public static final Target INPUT_COUNTRY_LIST= Target.the("shows us the list of countries")
            .locatedBy("//*[@name='countryId']");
    public static final Target INPUT_COUNTRY= Target.the("where do we write the country")
            .locatedBy("//*[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//*[text()='{0}']");
    public static final Target NEXTDEVICES_BUTTON = Target.the("button to go to the next section")
            .locatedBy("//*[@class='btn btn-blue pull-right']");

    //REGISTER STEP 3

    public static final Target INPUT_COMPUTER_lIST= Target.the("shows us the list of computers")
            .locatedBy("//*[text()='Your Computer:']/ancestor::*[2]//*[@name='osId']");
    public static final Target INPUT_COMPUTER= Target.the("where do we write the type of computer")
            .locatedBy("//*[@id='ui-select-choices-row-3-2']//*[text()='{0}']");
    public static final Target INPUT_VERSION_LIST = Target.the("shows us the list of computers versions")
            .locatedBy("//*[text()='Version:']/ancestor::*[2]//*[@name='osVersionId']");
    public static final Target INPUT_VERSION= Target.the("where do we write the type computer's version")
            .locatedBy("//*[@id='ui-select-choices-row-4-1']//*[text()='{0}']");
    public static final Target INPUT_LENGUAGEFIELD_LIST= Target.the("shows us the list of lenguages")
            .locatedBy("//*[text()='Language:']/ancestor::*[2]//*[@name='osLanguageId']");
    public static final Target INPUT_LENGUAGEFIELD= Target.the("choose a lenguage")
            .locatedBy("//*[@id='ui-select-choices-row-5-37']//*[text()='{0}']");
    public static final Target LASTSTEP_BUTTON = Target.the("button to go to the next section")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a");

    //REGISTER STEP 4

    public static final Target CREATE_PASSWORD = Target.the("the user creates password")
            .located(By.cssSelector("#password"));
    public static final Target CONFIRM_PASSWORD = Target.the("the user confirms password")
            .located(By.cssSelector("#confirmPassword"));
    public static final Target READ_AND_ACCEPT_TERMS_OF_USED = Target.the("the user creates password")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target READ_AND_ACCEPT_PRIVACY_AND_SECURITY = Target.the("the user confirms password")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("button to go to the next section")
            .located(By.cssSelector("#laddaBtn"));

}
