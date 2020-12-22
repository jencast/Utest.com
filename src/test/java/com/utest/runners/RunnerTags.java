package com.utest.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/registerUtest.feature",
        tags = "@Tag0",
        glue = "com.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}