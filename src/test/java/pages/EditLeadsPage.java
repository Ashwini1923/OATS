package pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import wdMethods.ProjectMethods;

public class EditLeadsPage extends ProjectMethods {
	
	@Parameters({"companyname"})
	public EditLeadsPage updatecompany(String Cname) {
	WebElement elecompname= locateElement("id", "updateLeadForm_companyName");
	type(elecompname, Cname);
	
	return this;
}
	
	public EditLeadsPage clickupdatebutton() {
		
		WebElement eleLink8	 = locateElement("xpath", "((//input[@class = 'smallSubmit'])[1])");
		click(eleLink8);
		return this;
	}
}
