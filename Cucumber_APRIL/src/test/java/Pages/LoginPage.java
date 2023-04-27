package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By UserName=By.xpath("//input[@name='username']");
	By PassWord=By.xpath("//input[@placeholder='Password']");
	By Clickbutton=By.xpath("//button[@type='submit']");
	
	public void passdriver(WebDriver driver1) {
		
		 this.driver=driver1;
		
	}
 public void Login(String Username,String Password) {
	 
	 driver.findElement(UserName).sendKeys(Username);
		driver.findElement(PassWord).sendKeys(Password);
		driver.findElement(Clickbutton).click();

	 
	 
 }
}


