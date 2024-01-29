package scripts.SeleniumFramework4X.StepDefinition;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import scripts.SeleniumFramework4X.config.SeleniumNGSuite;
import scripts.SeleniumFramework4X.config.LocalDriverManager;
import scripts.SeleniumFramework4X.PageObjects.LoginPageSuren;

@Listeners(ListenerImplementation.class)
public class LoginPageStepDefiniton {
	
	public String scenarioName;
	Scenario sce;
	
	@BeforeMethod
	@Before()
	public void beforeHook(Scenario scenario) throws Throwable {
		this.sce = scenario;
		scenarioName = scenario.getName();
		System.out.println("scenario name is : " +scenarioName);
		LoginPageSuren.testResultUtilities.logger.log(LogStatus.PASS, "Started Execution for scenario:: "+scenarioName);
	}

	@AfterMethod
	public void afterHook() throws Throwable{
		LoginPageSuren.testResultUtilities.logger.log(LogStatus.PASS, "Execution Completed for scenario:: "+scenarioName);		
		scenarioName = null;
	}
	

@Given("user is on saucedemo login screen suren")
public void launchBrowser() throws Throwable {
	new SeleniumNGSuite().setUpSuite();
}

@When("user login to the aplication suren")
public void login() {
	instanceToLoginPage().loginToApp();
}


private LoginPageSuren instanceToLoginPage() {
	LoginPageSuren lp = new LoginPageSuren(LocalDriverManager.getDriver());
	return lp;
}



}

