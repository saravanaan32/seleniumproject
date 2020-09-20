package week2.day1.Assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		/****************** Pseudo Code ****************************/
		//
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		// 2. Enter UserName and Password Using Id Locator
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElementByClassName("decorativeSubmit").click();

		// 4. Click on CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();

		// 5. Click on Accounts Button
		driver.findElementByXPath("//a[contains(text(), 'Accounts')]").click();

		// 6. Click on Create Account
		driver.findElementByXPath("//a[contains(text(), 'Create Account')]").click();

		// 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElementByXPath("//*[@id='accountName']").sendKeys("Debit Limited Account");

		// 8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElementByXPath("//textarea[@name='description' and @class='inputBox']")
				.sendKeys("Selenium Automation Tester");

		// 9. Enter LocalName Field Using Xpath Locator
		driver.findElementByXPath("//*[@id='accountName']").sendKeys("Debit Limited Account");

		// 10. Enter SiteName Field Using Xpath Locator
		driver.findElementByXPath("//*[@id='officeSiteName']").sendKeys("Sai");

		// 11. Enter value for AnnualRevenue Field using Xpath Locator but class as
		// Attribute
		driver.findElementByXPath("//*[@id='annualRevenue' and @class='inputBox']").sendKeys("3213233232323");

		// 12. Select Industry as ComputerSoftware
		WebElement industryDropdown = driver.findElementByName("industryEnumId");
		Select industryDropdownValue = new Select(industryDropdown);
		industryDropdownValue.selectByVisibleText("Computer Software");

		// 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement ownershipList = driver.findElementByName("ownershipEnumId");
		Select ownershipListValue = new Select(ownershipList);
		ownershipListValue.selectByVisibleText("S-Corporation");

		// 14. Select Source as Employee using SelectByValue
		WebElement sourceList = driver.findElementByName("dataSourceId");
		Select sourceListValue = new Select(sourceList);
		sourceListValue.selectByValue("LEAD_EMPLOYEE");

		// 15. Select Marketing Campaign as eCommerce Site Internal Campaign using
		// SelectbyIndex
		WebElement marketingCampignList = driver.findElementByName("marketingCampaignId");
		Select marketingCampignListValue = new Select(marketingCampignList);
		marketingCampignListValue.selectByIndex(6);

		// 16. Select State/Province as Texas using SelectByValue
		WebElement stateList = driver.findElementByXPath("//*[@name='generalStateProvinceGeoId']");
		Select stateListValue = new Select(stateList);
		stateListValue.selectByValue("TX");
		// **************************Print the List and List Size****************
		List<WebElement> stateWebElements = stateListValue.getOptions();
		System.out.println("The State List Size is:- " + stateWebElements.size());
		for (WebElement stateForEachIterator : stateWebElements) {
			System.out.println("The States of United States are:- " + stateForEachIterator.getText());
		}

		// 17. Click on Create Account using Xpath Locator
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.close();
	}

}
