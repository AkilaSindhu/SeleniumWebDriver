package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("work");
		
		driver.findElement(By.xpath("//*[@class='wikipedia-search-button']")).click();
		
		Thread.sleep(Duration.ofSeconds(2));
		
		driver.findElement(By.linkText("Work")).click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
//		Approach1
		
		Object[] wd= driver.getWindowHandles().toArray();
		
		driver.switchTo().window( (String)wd[1]);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
//		Approach2
		
		Set<String> wd1= driver.getWindowHandles();
		
		List<String> wind= new ArrayList(wd1);
		
		for (String windows : wind) {
			
			String title = driver.switchTo().window(windows).getTitle();
			
//			if (title.equalsIgnoreCase("OrangeHRM")) {
//				break;
//			}

//			driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");			
			
			if (title.equalsIgnoreCase("OrangeHRM") || title.equalsIgnoreCase("Automation Testing Practice")) {
				
				driver.close();
			}
		}
		
//		driver.quit();

	}

}
