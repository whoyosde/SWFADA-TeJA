package org.swfada.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/build/cucumber-html-report"
                , "pretty:target/build/cucumber-pretty.txt"
                , "json:target/build/cucumber.json"},
        stepNotifications = true,
        features = "src/test/resources/Features",
        glue = "org.swfada",
       // tags = "@AltaExpediente or @Tramitación"
        tags = "@AltaExpediente"
)
public class AcceptanceTestSuite {
}
