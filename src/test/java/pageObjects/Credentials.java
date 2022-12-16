package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Credentials {
	
	
	String str1;
	String str2;
	 WebDriver dr;
	public Credentials(WebDriver dr, String str1, String str2)
	{
		this.dr=dr;
		this.str1=str1;
		this.str2=str2;
		PageFactory.initElements(dr, this);
	}
@FindBy(xpath="//input[@id='ap_email']")
WebElement user;
@FindBy(css="input#continue")
WebElement click2;
@FindBy(id="ap_password")
WebElement pswd;
@FindBy(id="signInSubmit")
WebElement click3;

public void log_In()
{
	//click1.click();
	user.sendKeys(str1);
	click2.click();
	pswd.sendKeys(str2);
	click3.click();
}
	


}
