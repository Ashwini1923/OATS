package Project_pages;

import wdMethods.SeMethods;

public class SalaryDetails extends SeMethods {
	
	

	
	public SelectBank entersalary()
	{
		
		String b = "100000";
		driver.findElementByXPath("//input[@name ='netAnnualIncome']").sendKeys(b);
		
		driver.findElementByXPath("//span[@class ='btn-space']//a").click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new SelectBank();
	}
	
	
	
		

}
