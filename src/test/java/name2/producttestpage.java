package name2;

import org.testng.annotations.Test;

import name1.baseclass;
import name1.objectclass;
import name1.productobject;

public class producttestpage 
{
	baseclass bc;
	productobject po;
	objectclass oc;
	
	public producttestpage()
	{
		bc=new baseclass();
		po=new productobject();
		oc=new objectclass();
	}
@Test
public void verifypagecount()
{
	//ob.womenclick();
	System.out.println(po.imagecount());
	System.out.println(po.productcount());
	}

}
