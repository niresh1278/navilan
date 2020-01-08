package name2;

import org.testng.Assert;
import org.testng.annotations.Test;

import name1.baseclass;
import name1.subscriptionobject1;
import name1.subscriptionobject2;

public class subscriptiontest1 {
	baseclass bc;
	subscriptionobject1 s1;
	subscriptionobject2 s2;
	
	public subscriptiontest1()
	{
		bc=new baseclass();
		s1=new subscriptionobject1();
		s2=new subscriptionobject2();
		
	}
	@Test
	public void verify()
	{
		s1.clickemail();
		s1.btclick();
		Assert.assertTrue(s2.verifyalertmessage().getText().contains("you have successfully subscribed to this newsletter"));
		
	}


}
