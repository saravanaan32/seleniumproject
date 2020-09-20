package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To Setup the Driver using Driver Manager instead System.setProperty("webdriver.chrome.driver" "path")
		WebDriverManager.chromedriver().setup();
		//Code to Open the Browser
		ChromeDriver driver=new ChromeDriver();
		//To Maximise the Window
		driver.manage().window().maximize();
		//To Load the Application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To close the browser
		driver.close();

	}

}
