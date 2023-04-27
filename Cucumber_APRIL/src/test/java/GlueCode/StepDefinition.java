package GlueCode;

import java.util.List;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.JobsPage;
import Pages.LoginPage;
import Pages.NationalityPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Before(value="@smoke",order=1)
	public void Test1()
	{
		System.out.println("This is before line");
	}
	@Before(order=0)
	public void Test5()
	{
		System.out.println("This is just before line");
	}
	@Before(order=2)
	public void Test6()
	{
		System.out.println("This is must before line");
	}
	@After(order=1)
	public void Test8()
	{
		System.out.println("This is just After line");
	}
	@After(order=2)
	public void Test7()
	{
		System.out.println("This is must After line");
	}
	@After(order=0)
	public void Test2()
	{
		System.out.println("This is After line");
	}
	
	@BeforeStep
	public void Test3()
	{
		System.out.println("This is before step");
	}
	@AfterStep
	public void Test4()
	{
		System.out.println("This is After step");
	}
	
	
	@Given("User opens chroome browser")
	public void user_opens_chroome_browser() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();    // driver=111222
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;	
	
	
	}
	@Then("User opens application URL{string}")
	public void user_opens_application_url_https_opensource_demo_orangehrmlive_com_web_index_php_auth_login(String TestURL) {
	   
		driver.get(TestURL);
	
	}
	@Given("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String Username, String Password) {
	   
		LoginPage L1= new LoginPage();
		L1.passdriver(driver);
		L1.Login(Username,Password);
	
	}
	@When("User creates Jobs record as")
	public void user_creates_jobs_record_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<Map<String,String>>JobsData=dataTable.asMaps(String.class,String.class);
		
		System.out.println("Number of rows:"+JobsData.size());
		
		for(int i=0;i<JobsData.size();i++) {
			
			System.out.println(JobsData.get(i).get("JobTitle"));
			
			System.out.println(JobsData.get(i).get("JobDescription"));
			
			System.out.println(JobsData.get(i).get("JobNote"));
			
			String JobTitle=JobsData.get(i).get("JobTitle");
			
			String JobDescription=JobsData.get(i).get("JobDescription");
			
			String JobNote=JobsData.get(i).get("JobNote");
			
			System.out.println("_____________");{
				
				JobsPage J1= new JobsPage();
				J1.passdriver(driver);
				J1.AddJobs(JobTitle,JobDescription,JobNote);
			}
			}
	}
	@When("User creates Nationality record as")
	public void user_creates_nationality_record_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
	   List<List<String>>NationalityData=dataTable.cells();
	   
	   System.out.println("Number of rows:"+NationalityData.size());
	   
	   for(int i=0;i<NationalityData.size();i++) {
	
		   System.out.println(NationalityData.get(i).get(0));
		   
		   String NationalityText=NationalityData.get(i).get(0);
		   
		   System.out.println("_______________"); {
			   
			   
			   NationalityPage N1= new NationalityPage();
			   N1.passdriver(driver);
			   N1.AddNationality(NationalityText);
		   }
		   
	   }
	
	}

	@Then("User logout")
	public void user_logout() {
	    
		HomePage H1= new HomePage();
		H1.passdriver(driver);
		H1.Logout();
		
	}
	@Then("User close browser")
	public void user_close_browser() {
	   
	     driver.close();
	}

}
	
	