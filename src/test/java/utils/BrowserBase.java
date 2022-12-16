package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBase {
	public WebDriver dr;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAurl");
		//String browser_properties = prop.getProperty("browser");
		
		if(dr == null)
		{
			WebDriverManager.chromedriver().setup();
	     	dr = new ChromeDriver();// driver gets the life
			
		//	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get(url);
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();

		}
		
		return dr;

}
}