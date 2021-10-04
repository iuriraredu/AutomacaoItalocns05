package br.com.iuriraredu.runTest;

import br.com.iuriraredu.settings.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {
                "br.com.iuriraredu.web",
                "br.com.iuriraredu.stepsDefinitions",
                "br.com.iuriraredu.hooks"
        },
        plugin = {
                "pretty",
                "json:test-output/cucumber.json"
        },
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@web"
)
public class RunTest extends BaseTest {
}
