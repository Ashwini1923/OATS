package Project_pages;

import wdMethods.SeMethods;

public class SelectBank extends SeMethods{
	
	
	
	public PersonalDetails bankselect()
	
	{
		
		driver.findElementByXPath("//span[contains(text(), 'ICICI')]").click();
		
		return new PersonalDetails();
	}

}
