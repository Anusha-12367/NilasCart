package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver dr;
	@BeforeTest
	public void urlloading()
	{
		dr = new FirefoxDriver();
		 dr.get("https://nilascart.in/");
		 dr.manage().window().maximize();
		 
	}

}
