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
public class HomePageSuren {


	public static TestResultsUtils testResultUtilities = new TestResultsUtils();
	WebDriver driver;
	public HomePageSuren(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addToCatButton;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	private WebElement cartLogo;
	
	@FindBy(xpath = "//div[@class='bm-burger-button']")
	private WebElement sideMenuBar;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutButton;
	
	
	
	public void navigateToCart() {
		try {
		LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		addToCatButton.click();
		cartLogo.click();
		testResultUtilities.logger.log(LogStatus.PASS, "Succesfully niavagted to cart");	
		}catch(Throwable e) {
			testResultUtilities.logger.log(LogStatus.FAIL, "unable to navigate to cart");	
		}
	}

	
	public void logoutFromApp() {
		try {
		LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));		
		sideMenuBar.click();
		logoutButton.click();
		testResultUtilities.logger.log(LogStatus.PASS, "Successfully loged from the app");	
		}catch(Throwable e) {
			testResultUtilities.logger.log(LogStatus.FAIL, "unable to logout to the app");	
		}
	}

}
