package StepDef;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContext;

public class Hooks {
	TestContext testcontext;
	public Hooks(TestContext testcontext)
	{
		this.testcontext=testcontext;
	}
	@After
	public void close() throws IOException
	{
		testcontext.browser.WebDriverManager().quit();
	}
	@AfterStep
	public void ScreenShort(Scenario scen) throws IOException
	{
		WebDriver dr=testcontext.browser.WebDriverManager();
		File source=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
	}

}
