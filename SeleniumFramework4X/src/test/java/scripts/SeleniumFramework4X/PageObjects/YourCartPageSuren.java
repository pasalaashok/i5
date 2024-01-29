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
public class YourCartPageSuren {


	public static TestResultsUtils testResultUtilities = new TestResultsUtils();
	WebDriver driver;
	public YourCartPageSuren(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement zipcode;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	
	public void fillform() {
		try {
		LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		firstName.sendKeys("2134");
		lastName.sendKeys("2134");
		zipcode.sendKeys("2134");
		continueBtn.click();
		testResultUtilities.logger.log(LogStatus.PASS, "Successfully filled form");	
		}catch(Throwable e) {
			testResultUtilities.logger.log(LogStatus.FAIL, "unable to fill form");	
		}
	}

}
