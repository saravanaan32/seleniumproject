package week2.day1.Assignments;

import java.sql.DriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMESystemLogin {

	public static void main(String[] args) {
		/***************** Pseudo Code *****************/
		// 1. Load url "https://acme-test.uipath.com/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");

		// 2. Enter email as "kumar.testleaf@gmail.com"
		driver.findElementById("email").sendKeys("saravanaan@gmail.com");

		// 3. Enter Password as "leaf@12"
		driver.findElementById("password").sendKeys("saibaba");

		// 4. Click login button
		driver.findElementByXPath("//button[contains(text(),'Login')]").click();

		// 5. Get the title of the page and print
		String ACMETitle = driver.getTitle();
		System.out.println("The Title of the ACME System:- " + ACMETitle);
		System.out.println("The Verification of ACME System Page Title:- " + (ACMETitle.contains("Dashboard")));

		// 6. Click on Log Out
		driver.findElementByXPath("//*[text()='Log Out']").click();

		// 7. Close the browser
		driver.close();

	}

}
