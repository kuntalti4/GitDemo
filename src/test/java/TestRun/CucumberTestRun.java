package TestRun;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Feature", // Specify the path to your feature files
    glue = "stepdefinations") // Specify the package where your step definitions are located

public class CucumberTestRun {
	
	
	    
}


