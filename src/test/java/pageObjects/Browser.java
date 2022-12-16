package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Browser {
	WebDriver dr;

	public Browser(WebDriver dr)
	{
		
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement click1;
	public void land()
	{
	dr.get("https://www.amazon.com/");	
	click1.click();
	}
            
}
