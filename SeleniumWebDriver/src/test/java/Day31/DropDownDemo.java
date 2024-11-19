package Day31;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//*[contains(@class,'multiselect dropdown')]")).click();
		
//		driver.findElements(By.xpath("//*[contains(@class,'multiselect-container')]"));
		
		List<WebElement> options = driver.findElements(By.xpath("//ul//label"));
		System.out.println(options.size());
		
		for(int i=0; i<options.size();i++){
			String value = options.get(i).getText();
			System.out.println(value);
			if(value.equals("Java") || value.equals("Python")) {
				options.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.close();
	}
}
