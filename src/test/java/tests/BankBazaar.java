package tests;

import org.testng.annotations.Test;

import Project_pages.HomePage_P;
import wdMethods.SeMethods;

public class BankBazaar extends SeMethods {

	
	@Test
	public void checkbankbazaar()
	
	{
		
		new HomePage_P()
	     .enterurl()
	     .Searchfunds()
	     .selectagedetails()
	     .entersalary()
	     .bankselect()
	     .enterpersonaldet()
	     .findschemes();
		
		
	}
}
