package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
   
	
	
	@And("add company name (.*)")
	public CreateLeadPage typeCompanyName(String data) {
		WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		type(eleCompanyName, data);
		return this;
	}
	
	@And("add first name (.*)")
	public CreateLeadPage typeFirstName	(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	
	@And("add last name (.*)")
	public CreateLeadPage typeLastName	(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, data);
		return this;
	}
	
	@And("And click on submit")
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return this; 
	}
	
}









