package name2;

import org.testng.Assert;
import org.testng.annotations.Test;

import name1.baseclass;
import name1.objectclass;

public class testclass 
{
	
	baseclass bc;
	objectclass oc;
	
	public testclass() {
		bc=new baseclass();
		oc=new objectclass();
	}
		
	@Test
		public void checkwomen() {

			Assert.assertTrue(oc.getwomenpage().isDisplayed());
		}
	
	@Test
	public void checkdress() {
		Assert.assertTrue(oc.getdresspage().isDisplayed());
	}
	@Test
	public void checktshirt() {
		Assert.assertTrue(oc.gettshirtpage().isDisplayed());
	}
		
	@Test
	public void cliwomen() {
		oc.clickwomen();
		Assert.assertTrue(oc.getTitlte().contains("Women"));
	}
	@Test
	public void clidress() {
		oc.clickdress();
		Assert.assertTrue(oc.getTitlte().contains("dress"));
	}
	@Test
	public void clitshirt() {
		oc.clicktshirt();
		Assert.assertTrue(oc.getTitlte().contains("T-shirt"));
	}
	}
	


