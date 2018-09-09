package Project_pages;

import wdMethods.SeMethods;

public class MutualfundSearch extends SeMethods {
	
	
	
	public AgeDetails Searchfunds()
	{
		
		driver.findElementByXPath("//a[contains(text(), 'Search for Mutual Funds')]").click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return new AgeDetails();
		
	}
	
	
	

}
