package Day32;

import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium");
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='lnnVSe']"));
		
		System.out.println(options.size());
		
		for (int i=0;i<options.size();i++) {
			String exp = options.get(i).getText();
			System.out.println(exp);
			if (exp.contains("webdriver")) {
				options.get(i).click();
				break;
			}	
		}
	}
}
