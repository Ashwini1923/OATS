package Project_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class AgeDetails extends SeMethods {

	
	
	public SalaryDetails selectagedetails()
	{
        int age = 25;
		
		/*Thread.sleep(5000);
		WebElement source = driver.findElementByXPath("//div[@class = 'rangeslider__handle']");
		String startage = source.getText();
		System.out.println(startage);
		int a = Integer.parseInt(startage);
	
	String endage = dec.getText();
	System.out.println(endage);
	int b = Integer.parseInt(endage);
	while(b >= a) {
		Actions builder = new Actions(driver);
	builder.dragAndDropBy(source, 80, 0).perform();
	Thread.sleep(2000);
	WebElement dec = driver.findElementByXPath("//div[@class='rangeslider__handle-label']");
	String endage = dec.getText(); 
	}
	*/
		
        Actions builder  = new Actions(driver);
		WebElement slider = driver.findElementByXPath("//div[@class='rangeslider__handle']");
		builder.dragAndDropBy(slider,(age-18)*8, 0).perform(); // 8 pixels for every age
		
		driver.findElementByXPath("//a[@data-value='1993-01']").click();
		driver.findElementByXPath("//div[@class ='react-datepicker__week']//div[contains(text() , '19')]").click();
		String text = driver.findElementByXPath("//div[@class ='Calendar_tableHeading_1ny8Y Calendar_yearLabel_3-jJc']//span").getText();
		
		System.out.println(text);
		
		driver.findElementByXPath("//span[@class ='btn-space']//a").click();
		
		return new SalaryDetails();
		
	}
}
