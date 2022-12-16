package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="StepDef",stepNotifications=true,
        plugin= {"pretty","html:target/CucumberReport.html","json:target/CucumberReport.json","junit:target/CucumberReport.xml",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class J_UnitTestRunner {
	
     
    		  
}
