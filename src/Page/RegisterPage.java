package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;

public class RegisterPage extends BaseClass{
	
	By fname=By.xpath("//*[@id=\"name\"]");
	By email=By.xpath("//*[@id=\"email\"]");
	By ph=By.xpath("//*[@id=\"txtphone\"]");
    By pas=By.xpath("//*[@id=\"txtpassword\"]");
    By cpass=By.xpath("//*[@id=\"txtpassword-confirm\"]");
    By sub=By.xpath("/html/body/div[3]/section/div/div/div[2]/div/form/div[6]/button");
    public RegisterPage(WebDriver dr)
    {
    	BaseClass.dr=dr;
    }
    public void register() throws InterruptedException
    {
    	Thread.sleep(2000);
    	dr.findElement(fname).sendKeys("Kishore");
    	dr.findElement(email).sendKeys("kishore@gmail.com");
    	dr.findElement(ph).sendKeys("9876556784");
    	dr.findElement(pas).sendKeys("mariamanu");
    	dr.findElement(cpass).sendKeys("mariamanu");
    	dr.findElement(sub).click();
    }
}
