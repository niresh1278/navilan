package name1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class womensize extends baseclass 
{
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenpage;

	@FindBy(xpath="//label[@for='layered_id_attribute_group_1']")
	private WebElement small;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_2']")
	private WebElement medium;
	
	@FindBy(xpath="//label[@for='layered_id_attribute_group_3']")
	private WebElement large;

	
	public womensize() {
		PageFactory.initElements(driver, this);
		}
	
	
	public WebElement clickwomen()
	{
		womenpage.click();
		return womenpage;
}
	public WebElement getsmall() 
	{
		return small;

	}
	public WebElement getmedium()
	{
		return medium;
	}
	public WebElement getlarge()
	{
		return large;
	
		// TODO Auto-generated method stub
		
	}
	}





	
	


