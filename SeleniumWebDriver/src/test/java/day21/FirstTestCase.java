package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
//launch the browser
//	RemoteWebDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
//	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
//open URL	
	driver.get("https://demo.opencart.com/");
//validate the title
	String actual =driver.getTitle();
	if(actual.equals("Your Store")) {
		System.out.println("Test case passed");
	} else {
	System.out.println("testcase failed");
	}
	driver.quit();	
	}
}
