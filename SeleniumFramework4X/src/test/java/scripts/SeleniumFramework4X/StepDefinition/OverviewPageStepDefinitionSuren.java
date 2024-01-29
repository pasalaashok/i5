package scripts.SeleniumFramework4X.StepDefinition;

import io.cucumber.java.en.And;
import scripts.SeleniumFramework4X.PageObjects.OverviewPageSuren;
import scripts.SeleniumFramework4X.config.LocalDriverManager;

public class OverviewPageStepDefinitionSuren {
	
	@And("user places order and navigate back to home")
	public void backHome() {
		instanceToOverviewPage().backToHOme();
	}
	
	private OverviewPageSuren instanceToOverviewPage() {
		OverviewPageSuren op = new OverviewPageSuren(LocalDriverManager.getDriver());
		return op;
	}

}
