package Test;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Page.RegisterPage;

public class RegLog extends BaseClass{
	
	@Test
	public void testregg() throws InterruptedException
	{
		
		RegisterPage rp=new RegisterPage(dr);
		
		rp.register();
	}
	

}
