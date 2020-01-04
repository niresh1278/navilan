package name1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectclass extends baseclass {
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenpage;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressespage;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement Tshirtspage;

	public objectclass() {
	PageFactory.initElements(driver, this);
	}
		
	public WebElement getwomenpage() {
		return womenpage;
	}
	public WebElement getdresspage() {
		return dressespage;
	}
	public WebElement gettshirtpage() {
		return Tshirtspage;
	}
	
	public void clickwomen()
	{
		womenpage.click();
	}
	public void clickdress()
	{
		dressespage.click();
	}
	public void clicktshirt()
	{
		Tshirtspage.click();
	}
		
		
	}
	
		
	
	

