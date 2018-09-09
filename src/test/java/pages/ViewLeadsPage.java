package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods {
	
	public EditLeadsPage clickEditLead() {
		
		WebElement eleLink7	 = locateElement("xpath", "(//a[contains(text() , 'Edit')])");
		click(eleLink7);
		
		
		return new EditLeadsPage();
		
		
		
		
		
	}

}
