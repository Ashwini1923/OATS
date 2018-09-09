/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	public static ChromeDriver driver;
	
	@Given("Launch the browser")
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
			
	}
	
	@And("Maximize the browser")
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
		
	}
	
	@And("set the timeouts")
	public void timeouts()
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@And("enter the URL")
	public void EnterUrl()
	{
		driver.get("http://leaftaps.com/opentaps");
	
	}
	
	
	
	@And("enter the username (.*)")
	public void enterusername(String data)
	{
		driver.findElementById("username").sendKeys(data);
	
	}

	@And("enter the password (.*)")
	public void enterPassword(String data)
	{
		driver.findElementById("password").sendKeys(data);
	
	}
	
	@When("click on the login button")
	public void enterLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	
	@Then("verify login is successful")
	public void verifylogin()
	{
		System.out.println("Logged in successfully");
	}
	
	@And("click on link")
	public void linkcrmsfa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("click on create lead")
	public void clickcreatelead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("add company name (.*)")
	public void addcompanyname(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}

	@And("add first name (.*)")
	public void addfirstname(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	
	@And("add last name (.*)")
	public void addlastname(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	
	@And("click on submit")
	public void submitcreatelead()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
     
	
	@But("login failed")
    public void loginfailed()
    {
		System.out.println("Login failed");
    }
}

*/