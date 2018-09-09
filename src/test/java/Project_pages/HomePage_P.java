package Project_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class HomePage_P extends SeMethods{

	public MutualfundSearch enterurl()
	{
		startApp("chrome" , "https://www.bankbazaar.com/");

		WebElement element =locateElement("xpath", "(//a[text()='INVESTMENTS'])[1]");

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		WebElement ele2 = locateElement("xpath", "//a[text()='Mutual Funds']");

		click(ele2);

		return new MutualfundSearch();

	}




}
