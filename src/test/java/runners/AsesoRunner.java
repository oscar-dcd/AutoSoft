package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/Asesoftware.feature",
		glue="stepdefinitions",
		tags="@tag",
		snippets = SnippetType.CAMELCASE)
public class AsesoRunner {

}
