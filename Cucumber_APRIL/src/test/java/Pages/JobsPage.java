package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobsPage {

	WebDriver driver;
	By Admin=By.xpath("//span[text()='Admin']");
	By Jobs=By.xpath("//span[text()='Job ']");
	By Jobtitle=By.xpath("//a[text()='Job Titles']");
	By AddButton=By.xpath("(//button[@type='button'])[2]");
	By jobtitle=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By jobdescription=By.xpath("//textarea[@placeholder='Type description here']");
	By jobnote=By.xpath("//textarea[@placeholder='Add note']");
	By Savebutton=By.xpath("//button[@type='submit']");
	
	
	public void passdriver(WebDriver driver1) {
		
		this.driver=driver1;
		
	}
	
	
	
	
	public void AddJobs(String JobTitle,String JobDescription,String JobNote) throws InterruptedException {
		
		driver.findElement(Admin).click(); //Admin
		driver.findElement(Jobs).click(); //Jobs
		driver.findElement(Jobtitle).click(); //Job Titles
		
		Thread.sleep(5000); 
		driver.findElement(AddButton).click(); //Add button
		
		
		driver.findElement(jobtitle).sendKeys(JobTitle);
		driver.findElement(jobdescription).sendKeys(JobDescription);
		driver.findElement(jobnote).sendKeys(JobNote);
		
		
		Thread.sleep(5000); //execution will be passed for 5 seconds
			
		driver.findElement(Savebutton).click();  //Save
	
		
		
	}
}
