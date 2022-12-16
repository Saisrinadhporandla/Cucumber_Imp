package TestRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="StepDef",monochrome=true)

public class testngTest extends AbstractTestNGCucumberTests{
	
	
//	@DataProvider(parallel=true)
//	public Object[][] scenarios()
//     {
//      return super.scenarios();
//     }
// 
}
