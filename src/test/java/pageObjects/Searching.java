package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching {
	WebDriver dr;
	String mbl;
	public Searching(WebDriver dr,String mbl)
	{
		this.mbl=mbl;
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement click5;
	public void add()
	{
		search.sendKeys("one plus 10 pro");
		click5.click();

}
}
