package week2.day1.Assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		/************************* Pseudo Code ***********************/

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		// 2. Enter UserName and Password Using Id Locator

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator

		driver.findElementByClassName("decorativeSubmit").click();

		// 4. Click on CRM/SFA Link

		driver.findElementByLinkText("CRM/SFA").click();

		// 5. Click on Leads Button

		driver.findElementByLinkText("Leads").click();

		// 6. Click on create Lead Button

		driver.findElementByLinkText("Create Lead").click();

		// 7. Enter CompanyName using id Locator

		driver.findElementById("createLeadForm_companyName").sendKeys("Sai Enterprises");

		// 8. Enter FirstName using id Locator

		driver.findElementById("createLeadForm_firstName").sendKeys("Saravanan");

		// 9. Enter LastName using id Locator

		driver.findElementById("createLeadForm_lastName").sendKeys("Jeganathan");

		// 10. Select value as Employee in Source Using SelectbyVisible text

		WebElement sourceList = driver.findElementByName("dataSourceId");
		Select sourceListValue = new Select(sourceList);
		sourceListValue.selectByVisibleText("Conference");
		// System.out.println(sourceList.getSize()); - we cant take the size of the
		// list, you need to put it in the list and iterate it

		// ******************Web Element List*******************************//
		List<WebElement> sourceElementList = sourceListValue.getOptions();
		System.out.println("The Source List Size:- " + (sourceElementList.size()));
		for (WebElement sourceForEachIterator : sourceElementList) {
			System.out.println("The Source elements are:- " + sourceForEachIterator.getText());
		}

		// 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using
		// SelectbyValue
		WebElement marketingCampignList = driver.findElementByName("marketingCampaignId");
		Select marketingCampignListValue = new Select(marketingCampignList);
		marketingCampignListValue.selectByValue("CATRQ_AUTOMOBILE");

		// ******************Web Element List*******************************//
		List<WebElement> marketingCampignElementList = marketingCampignListValue.getOptions();
		System.out.println("The Market Campign List size:- " + marketingCampignElementList.size());
		for (WebElement marketingCampignForEachIterator : marketingCampignElementList) {
			System.out.println("The Marketing Campign elements are:- " + marketingCampignForEachIterator.getText());
		}

		// 12. Select value as Telecommunications from the bottom (size-2) in Industry
		// using SelectByIndex
		WebElement industryList = driver.findElementByName("industryEnumId");
		Select industryListValue = new Select(industryList);
		List<WebElement> industryElementList = industryListValue.getOptions();
		int industryElementListSize = industryElementList.size();
		System.out.println("The Industry list size is:- " + industryElementListSize);
		industryListValue.selectByIndex(industryElementListSize - 2);

		// 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement ownershipList = driver.findElementByName("ownershipEnumId");
		Select ownershipListValue = new Select(ownershipList);
		ownershipListValue.selectByIndex(3);
		/// ***************Web Element List - For Iterator*************************//
		List<WebElement> ownershipElements = ownershipListValue.getOptions();
		System.out.println("The Ownership List Size is:- " + ownershipElements.size());
		for (int i = 1; i < ownershipElements.size(); i++) {
			System.out.println(ownershipElements.get(i));
		}

		// 14. Select value as India in Country Field Using SelectbyVisibletext
		WebElement countryList = driver.findElementByName("generalCountryGeoId");
		Select countryListValue = new Select(countryList);
		countryListValue.selectByVisibleText("India");
		/// ***************Web Element List - For Each
		/// Iterator*************************//
		List<WebElement> countryListElements = countryListValue.getOptions();
		System.out.println("The Conntry List Size is:- " + countryListElements.size());
		for (WebElement countryListForEachIterator : countryListElements) {
			System.out.println("The Country Lists are:- " + countryListForEachIterator.getText());
		}

		// 15. Click on create Lead Button Using name Locator
		driver.findElementByName("submitButton").click();

		// 16. Get the Title of the resulting Page
		String viewLeads = driver.getTitle();
		System.out.println("The Title Page verification of the Resulting Page:- " + (viewLeads.contains("View Lead")));
		driver.close();
	}

}