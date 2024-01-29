package scripts.SeleniumFramework4X.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.LogStatus;

import scripts.SeleniumFramework4X.StepDefinition.ListenerImplementation;
import scripts.SeleniumFramework4X.Utilities.TestResultsUtils;
import scripts.SeleniumFramework4X.config.LocalDriverManager;

@Listeners(ListenerImplementation.class)
public class LoginPageSuren {


	public static TestResultsUtils testResultUtilities = new TestResultsUtils();
	WebDriver driver;
	public LoginPageSuren(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement usernameTextField;
	
	@FindBy(id = "password")
	private WebElement passwordTextField;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	
	public void loginToApp() {
		try {
		LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		usernameTextField.sendKeys("standard_user");
		passwordTextField.sendKeys("secret_sauce");
		loginButton.click();
		testResultUtilities.logger.log(LogStatus.PASS, "Succcessfully logged into the app");	
		}catch(Throwable e) {
			testResultUtilities.logger.log(LogStatus.FAIL, "unable to login to the app");	
		}
	}
	
	

}
