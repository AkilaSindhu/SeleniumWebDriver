package Day32;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Practise32 {
//	find the lowest price from the table
//	once the lowest price is found, click on the choose this flight button
//	fill all the data and click the purchase flight 
//	validate the purchase message

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		String singlevalue=driver.findElement(By.xpath("//tbody//tr[1]//td[6]")).getText();
//		System.out.println(singlevalue);
		
		int all=driver.findElements(By.xpath("//tbody//tr//td[6]")).size();
		System.out.println(all);
		
		String r[] = new String[all];//0,1,2,3,4
		
		System.out.println(r.length);
		
		for (int i = 1; i <=all; i++) { //1,2,3,4,5
//			if (i!=6) {
		String price = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]")).getText();
		System.out.println(price);
		r[i-1] = price; //0,1,2,3,4
//			}
		}
		
//		System.out.println(Arrays.toString(r));
//		System.out.println(r);
		Arrays.sort(r);
	
		System.out.println(Arrays.toString(r));
		
		String expect = r[0];
		
		System.out.println(expect);
		
		for(int i=1;i<=r.length;i++) {
			String actual = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]")).getText();
			if(actual.equalsIgnoreCase(expect)) {
				driver.findElement(By.xpath("//tbody//tr["+i+"]//input")).click();
				break;
			}
		}
		
//		System.out.println(driver.findElement(By.xpath("//*[text()='Flight Number: UA954']")).isDisplayed());
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Abcd");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 road");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("TN");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		System.out.println(
				driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).getText());
		System.out.println(
		driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).isDisplayed());
		driver.quit();		
	}

}
