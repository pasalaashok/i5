package scripts.SeleniumFramework4X.StepDefinition;

import io.cucumber.java.en.And;
import scripts.SeleniumFramework4X.PageObjects.YourINfoPageSuren;
import scripts.SeleniumFramework4X.config.LocalDriverManager;

public class YourInfoPageStepDefinitionSuren {

	@And("user checkout the product")
	public void checkout() {
		instanceToYourINfoPage().cheeckout();
	}
	
	private YourINfoPageSuren instanceToYourINfoPage() {
		YourINfoPageSuren yp = new YourINfoPageSuren(LocalDriverManager.getDriver());
		return yp;
	}
}
