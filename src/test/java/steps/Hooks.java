package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {

	@Before
	public void beforeCucumber(Scenario sc) {
		startResult();
		 testCaseName=sc.getName();
		 testCaseDescription= sc.getId();
		 author="smoke";
		 category="babu";
		 startTestCase();
		 startApp("chrome", "http://leaftaps.com/opentaps");
		/*System.out.println("Scenario name" + sc.getName());
		System.out.println("Scenario ID " + sc.getId());*/
	}

	@After
	public void afterscenario(Scenario sc) {

		closeAllBrowsers();
		stopResult();
		
		/*System.out.println("Status: " + sc.getStatus());*/
	}

}
