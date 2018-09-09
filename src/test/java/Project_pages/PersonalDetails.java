package Project_pages;

import wdMethods.SeMethods;

public class PersonalDetails extends SeMethods {
	
	public SchemeDetails enterpersonaldet()
	
	{
		
		String data = "Tara";
		driver.findElementByXPath("//input[@name = 'firstName']").sendKeys(data);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElementByXPath("//span[@class ='btn-space']//a").click();
		
		
		return new SchemeDetails();
	}
	

}
