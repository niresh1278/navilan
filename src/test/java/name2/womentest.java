package name2;

import org.testng.Assert;
import org.testng.annotations.Test;

import name1.baseclass;
import name1.objectclass;
import name1.womensize;

public class womentest {
	
	baseclass bc;
	womensize ws;

	public womentest() {
		bc=new baseclass();
		ws=new womensize();
		
	}
	
	@Test

	public void checksmall() {
		ws.clickwomen();
		Assert.assertTrue(ws.getsmall().isDisplayed());
		Assert.assertTrue(ws.getmedium().isDisplayed());
	    Assert.assertTrue(ws.getlarge().isDisplayed());
}




}