package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContext {
	public WebDriver dr;
	public BrowserBase browser;
	public PageObjectManager pom;
	public TestContext() throws IOException
	{
		browser=new BrowserBase();
		pom=new PageObjectManager(browser.WebDriverManager());
	}


}
