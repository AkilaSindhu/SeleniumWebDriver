package Day29;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(Duration.ofSeconds(5));
		
		List<WebElement> allcheckbox=  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for (int i=0;i<allcheckbox.size();i++) {
			allcheckbox.get(i).click();
		}
		
//		boolean checked= driver.findElement(By.xpath("//td//input[@type='checkbox']")).isDisplayed();
//		do{
//		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
//		} while (driver.findElement(By.xpath("//td//input[@type='checkbox']")).isDisplayed());
		
		
		Thread.sleep(Duration.ofSeconds(5));
		
		List<WebElement> checks=  driver.findElements(By.xpath("//td//input[@type='checkbox']"));
		
		for(int i=0; i> checks.size();i++) {
			checks.get(i).click();
		}
		
		
	}

}
