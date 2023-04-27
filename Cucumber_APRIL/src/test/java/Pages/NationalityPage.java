package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NationalityPage {
	
	WebDriver driver;
	By Admin=By.xpath("//span[text()='Admin']");
	By Nationality=By.xpath("//a[text()='Nationalities']");
	By Addbutton=By.xpath("(//button[@type='button'])[2]");
	By nationalitytext=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By Submitbutton=By.xpath("//button[@type='submit']");


public void passdriver(WebDriver driver1) {
	
	this.driver=driver1; 
	
}


public void AddNationality(String NationalityText) throws InterruptedException {
	 
	 driver.findElement(Admin).click(); 
	  driver.findElement(Nationality).click();
	  driver.findElement(Addbutton).click(); 
	  driver.findElement(nationalitytext).sendKeys(NationalityText);
		
		Thread.sleep(5000);
		  driver.findElement(Submitbutton).click();

 }
}
