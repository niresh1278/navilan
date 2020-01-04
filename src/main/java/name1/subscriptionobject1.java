package name1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class subscriptionobject1 extends baseclass {
	@FindBy(id="newsletter-input")
	private WebElement emailbox;
	
	@FindBy(name="submitNewsletter")
	private WebElement emailsubmitbuton;
	
	public subscriptionobject1()
	{
		PageFactory.initElements(driver, this);

	}

//	public WebElement clickemail()
	{
		emailbox.sendKeys("nisha.naga83@gmail.com");
	}

}
