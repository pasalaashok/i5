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
public class YourINfoPageSuren {


	public static TestResultsUtils testResultUtilities = new TestResultsUtils();
	WebDriver driver;
	public YourINfoPageSuren(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "checkout")
	private WebElement checkoutbutton;
	
	
	public void cheeckout() {
		try {
		LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		checkoutbutton.click();
		testResultUtilities.logger.log(LogStatus.PASS, "Successfully clicekd onnc ehckout btn");	
		}catch(Throwable e) {
			testResultUtilities.logger.log(LogStatus.FAIL, "unable to click on check out");	
		}
	}

}
