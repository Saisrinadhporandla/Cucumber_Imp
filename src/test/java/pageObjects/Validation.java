package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Validation {
	WebDriver dr;
	
	public Validation(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(css="div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-size-medium a-color-base a-text-normal']")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement click5;
	public void add()
	{
		String name=search.getText().split(" ")[0].trim();
		String pro="OnePlus";
        Assert.assertTrue(pro.contains(name), "Test failed");
		

}

}
