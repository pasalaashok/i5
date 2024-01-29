package scripts.SeleniumFramework4X.StepDefinition;

import io.cucumber.java.en.Then;
import scripts.SeleniumFramework4X.PageObjects.HomePageSuren;
import scripts.SeleniumFramework4X.config.LocalDriverManager;

public class HomePageStepDefinitonSuren {
	
	
	@Then("user navigates to cart screen upon adding a product suren")
	public void cartNavigation() {
		instanceToHomePage().navigateToCart();
	}
	
	@Then("user logout from the application")
	public void logout() {
		instanceToHomePage().logoutFromApp();
	}
	
	private HomePageSuren instanceToHomePage() {
		HomePageSuren hp = new HomePageSuren(LocalDriverManager.getDriver());
		return hp;
	}

}
