package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WorkCssDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com");
		Thread.sleep(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[class='form-control form-control-lg']")).sendKeys("Galaxy s24");
		driver.findElement(By.cssSelector("button[class='btn btn-light btn-lg']")).click();

		if(driver.findElement(By.xpath("(//*[text()=\"Search - Galaxy s24\"])[2]")).isDisplayed()) {
			System.out.println("testcase is passed");
		} else {
			Assert.fail();
		}
		
		driver.quit();
	}

}
