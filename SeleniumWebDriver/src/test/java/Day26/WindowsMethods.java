package Day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowsMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(Duration.ofSeconds(3));
//		Automation Testing Practice
		String Title =driver.getTitle();
		if (Title.equalsIgnoreCase("Automation Testing Practice")) {
			System.out.println("title is matching: "+ Title);
		}
		
		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
//		String WindowID = driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("work");
		driver.findElement(By.xpath("//*[@class='wikipedia-search-button']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Work")).click();
		Thread.sleep(Duration.ofSeconds(5));
//		String newwindow=driver.getWindowHandle();
//		Set<String> Windowids=driver.getWindowHandles();
//		
//		for(String id:Windowids) {
//			driver.switchTo().window(id);
//			if(driver.findElement(By.xpath("//*[@class='mw-logo-wordmark']")).isDisplayed()) {
//			break;
//			}
//		}
		
		Object[] windows = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windows[1]);
		
		boolean actual = driver.findElement(By.xpath("//*[text()='Manual labour']")).isDisplayed();
		if(actual == true) {
			System.out.println("Testcase pass");
		} else {
			Assert.fail();
		}
		
		driver.switchTo().window((String)windows[0]);
		if (driver.findElement(By.xpath("//*[text()='GUI Elements']")).isDisplayed()) {
			System.out.println("Driver is in 1st window");
		}
		
		driver.quit();
	}

}
