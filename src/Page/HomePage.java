package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;

public class HomePage extends BaseClass{
	
	By regid=By.cssSelector("li.nav-item:nth-child(2) > a:nth-child(1)");

	public HomePage(WebDriver dr) {
		
		BaseClass.dr=dr;
	}

	public void register() throws InterruptedException {
		
		
		
		dr.findElement(regid).click();
		
		
	}

}
