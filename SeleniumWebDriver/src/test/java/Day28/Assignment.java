package Day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		//*[@id="wikipedia-search-result-link"]/*
//		//*[@target="_blank"]
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("work");
		
		driver.findElement(By.xpath("//*[@class='wikipedia-search-button']")).click();
		
		Thread.sleep(Duration.ofSeconds(2));
		
		List<WebElement> links =  driver.findElements(By.xpath("//*[@target='_blank']"));
		
		for(int i=2;i<=7;i++) {
			links.get(i).click();
		}

//		List<WebElement> links= driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
		
		Object[] ob =driver.getWindowHandles().toArray();
		
		for (int i=0;i<ob.length;i++) {	
			String title = driver.switchTo().window((String)ob[i]).getTitle();
			System.out.println(title);
			if(title.equalsIgnoreCase("Workweek and weekend - Wikipedia") || title.equalsIgnoreCase("Working Families Party - Wikipedia"))
			{
				driver.close();
			}	
		}
	}

}
