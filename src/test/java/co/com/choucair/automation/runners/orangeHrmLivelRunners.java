package co.com.choucair.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (

        features = "src/test/resources/features/simulacion_orangehrmlive.feature", tags = "@Prueba",
        glue = "co.com.choucair.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class orangeHrmLivelRunners {
}
