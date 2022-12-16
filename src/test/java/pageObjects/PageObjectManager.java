package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver dr;
	public Browser browser;
	public Validation validation;
	public Credentials credentials;
	public Searching search;
	public PageObjectManager(WebDriver dr)
	{
		this.dr=dr;
	}
//	public Browser Browser()
//	{
//		browser=new Browser(dr);
//		return browser;
//	}
	public Credentials Credentials(String str1,String str2)
	{
		credentials=new Credentials(dr,str1, str2);
		return credentials;
				
	}
	public Searching Searching(String mbl)
	{
		search= new Searching(dr,mbl);
		return search;
	}
	public Validation Validation()
	{
		validation=new Validation(dr);
		return  validation;
	}
}
