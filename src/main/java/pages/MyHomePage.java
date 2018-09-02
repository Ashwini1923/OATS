package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	//Create lead purpose
	public MyLeadsPage clickLeads() {
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		return new MyLeadsPage();
	}
	
//Edit lead purpose
	public FindLeadsPage clickLeads1() {
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		return new FindLeadsPage();
	}
	
}










