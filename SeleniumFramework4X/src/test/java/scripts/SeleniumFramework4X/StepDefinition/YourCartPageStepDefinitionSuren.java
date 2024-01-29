package scripts.SeleniumFramework4X.StepDefinition;

import io.cucumber.java.en.Then;
import scripts.SeleniumFramework4X.PageObjects.YourCartPageSuren;
import scripts.SeleniumFramework4X.config.LocalDriverManager;

public class YourCartPageStepDefinitionSuren {
	
	@Then("user fills the form navigate to order confirmation screen")
	public void navigateFinishScreen() {
		instanceToYourCartPage().fillform();
	}

	
	private YourCartPageSuren instanceToYourCartPage() {
		YourCartPageSuren yp = new YourCartPageSuren(LocalDriverManager.getDriver());
		return yp;
	}
}
