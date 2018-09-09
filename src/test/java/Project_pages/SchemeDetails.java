package Project_pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class SchemeDetails extends SeMethods {
	
	
	public void findschemes()
	{
		
	 List<WebElement> allschemes = driver.findElementsByXPath("//li[@class ='js-offer-name']");
	 
	 for(WebElement eachscheme : allschemes)
		
	 {
		 
		 System.out.println(eachscheme.getText());
		 
		 WebElement eleAmount = driver.findElementByXPath("//span[contains(text(),'"+eachscheme.getText()+"')]/following::span[@class='fui-rupee bb-rupee-xs']/..");
			System.out.println(eleAmount.getText());
			
	 }
		
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
	 
	}
	
	

}
