package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;

public class SkinCare extends BaseClass{
	
	By view=By.xpath("/html/body/div[3]/section/section/div/div/div[2]/div/div[1]/div/div[2]/div/span[2]/a/i");
	By addcrt=By.xpath("/html/body/div[3]/section/div[2]/div[3]/div[2]/form[1]/button");
	By pdt=By.xpath("/html/body/div/nav/div/div/ul/li[2]/a");
	//By lip=By.xpath("/html/body/div[3]/section/section/div/div/div[2]/div/div[4]/div/div[2]/div/span[1]/a");
	
	public SkinCare(WebDriver dr)
	{
		BaseClass.dr=dr;
	}
	
	public void skincare() throws InterruptedException
	{
		Thread.sleep(1000);
		//dr.findElement(view).click();
		dr.findElement(pdt).click();
		dr.findElement(view).click();
		dr.findElement(addcrt).click();
		
		
	}

}
