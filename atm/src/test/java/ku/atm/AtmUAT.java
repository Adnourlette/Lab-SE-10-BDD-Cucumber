/* 6410401132 Ratti Keatchaiyo */
package ku.atm;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber.html"})
public class AtmUAT {

}
