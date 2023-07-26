package Test;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Page.HomePage;

public class LoginPage extends BaseClass{
	@Test
	public void testlogin() throws InterruptedException
	{
		
		HomePage hp=new HomePage(dr);
		
		hp.register();
	}

}
