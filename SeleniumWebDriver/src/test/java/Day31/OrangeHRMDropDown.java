package Day31;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[3]")).click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[contains(@class,'oxd-select-dropdown')]//span")).click();
		
		
		Boolean result=driver.findElement(By.xpath("(//*[text()='Account Assistant'])[1]")).isDisplayed();
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
