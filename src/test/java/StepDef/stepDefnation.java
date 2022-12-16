package StepDef;


import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.BrowserBase;
import utils.TestContext;

//@RunWith(Cucumber.class)
public class stepDefnation {
	public WebDriver dr;
	public TestContext test;
	public PageObjectManager pom;
	public BrowserBase base;
	public stepDefnation(TestContext test)
	{
		this.test=test;
	}
	@Given("^user on amazon landing page$")
    public void landing() throws Throwable {
		test.browser.WebDriverManager();
    }
	@When("^user entered mobile number \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void details(String str1, String str2) throws Throwable {
//		Credentials land=new Credentials(base.WebDriverManager(),str1,str2);
//		land.log_In();
		test.pom.Credentials(str1, str2).log_In();
		
    }
	 @And("^user searched for \"([^\"]*)\" in search bar$")
	    public void search(String mbl) throws Throwable {
//		 Searching search=new Searching(base.WebDriverManager(),mbl);
//		 search.add();
		 test.pom.Searching(mbl).add();
	    }
	 @Then("^user able to see products retated to one plus 10 pro$")
	 public void result()
	 {
		 test.pom.Validation().add();
//		 Validation valid=new Validation(test.driver);
//		 valid.add();
	 }

}