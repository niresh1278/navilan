package name1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class subscriptionobject2 extends baseclass {
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement alertmessage;
	
	public subscriptionobject2()
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement verifyalertmessage()
	{
		return alertmessage;

	}

}
