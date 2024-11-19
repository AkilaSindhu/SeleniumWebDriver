package Day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println(
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).isDisplayed());
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(10000);
		System.out.println(
		driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed());
		driver.findElement(By.xpath("//li[@id='menu-customer']//a")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		Thread.sleep(5000);
		System.out.println(
		driver.findElement(By.xpath("(//div[@class='card-header'])[2]")).getText());
		System.out.println(
		driver.findElement(By.xpath("(//div[@class='card-header'])[2]")).isDisplayed());
		String s =driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		Integer number = Integer.parseInt(s.substring(s.indexOf("(")+1, s.indexOf("Pages")-1));
		System.out.println(number);
		int totalrow= driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println(totalrow);
		int i=2;
		do {
			Thread.sleep(10000);
			for(int r=1;r<=totalrow;r++) {
			mywait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//tbody//tr["+r+"]//td[2]"))));
			System.out.print(driver.findElement(By.xpath("//tbody//tr["+r+"]//td[2]")).getText());
				}
			mywait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='pagination']//li["+i+"]//a"))));
			System.out.println("page number " +i);
			driver.findElement(By.xpath("//ul[@class='pagination']//li["+i+"]//a")).click();
			if(i==2) {
				i+=3;
			}else if (i!=2) {
				i++;
			}
		} while ( i<=8);
		driver.quit();
	}
}
