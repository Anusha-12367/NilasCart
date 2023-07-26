package Test;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Page.SkinCare;

public class SkinCare1 extends BaseClass{
	
	@Test
	public void linkselect() throws InterruptedException
	{
		SkinCare sc=new SkinCare(dr);
		sc.skincare();	
	}

}
