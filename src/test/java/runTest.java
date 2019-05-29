package CucumberJava;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 
import cucumber.api.CucumberOptions; 
import cucumber.api.testng AbstractTestNGCucumberTests;

@RunWith(Cucumber.class) 
@CucumberOptions(features = {"src/test/java/features"}, format = {"json:target/cucumber.json"}, glue = "steps")

public class runTest { }
