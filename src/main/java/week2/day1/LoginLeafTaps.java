package week2.day1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginLeafTaps 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//****************Launch Application using Chrome Browser****************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//****************1. Identifying the Webelement****************//
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("demosalesmanager");
		
		//****************2. Identifying the Webelement - driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement source = driver.findElementByName("dataSourceId");
		Select sourceDropDown = new Select(source);
		
		//****************Different option for Select Class****************//
		//****************1. Select by Visible Text****************//
		//sourceDropDown.selectByVisibleText("Employee");
		
		//****************2. Select by Value****************//
		//sourceDropDown.selectByValue("LEAD_CONFERENCE");
		
		//****************3. Select by Index (First Index will be 0) - I want to select the first element in the drop down****************//
		//sourceDropDown.selectByIndex(0);
		
		//****************4. List of Web Elements***********//
		List<WebElement> options = sourceDropDown.getOptions();
		System.out.println(options.size());
		//System.out.println("The 3rd Index Item Print:- " +(options.subList(3, 8)));
		System.out.println("The List of WebElements in foreach Loop:- ");
		for (WebElement list : options) {
			System.out.println(list.getText());
			
		}
		driver.close();
		
	}

}
