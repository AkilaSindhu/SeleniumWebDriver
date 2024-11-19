package Day32;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		int column = driver.findElements(By.xpath("//tbody[@style='box-sizing:inherit']//th")).size();
				
		int row = driver.findElements(By.xpath("//tbody[@style='box-sizing:inherit']//tr")).size();
		
		System.out.println("number of row: " +row);
		System.out.println("number of column: "+column);
//		get data for specific row and column
		
//		System.out.println(driver.findElement(By.xpath("//tbody[@style='box-sizing:inherit']//tr[7]//td[2]//span")).getText());
		
//		read all data
		
//		for(int r=2;r<=row;r++) {
//			for (int c=1;c<=column;c++) {
//				String value=driver.findElement(By.xpath("//tbody[@style='box-sizing:inherit']//tr["+r+"]//td["+c+"]//span")).getText();
//				System.out.println(value+"\t");
//			}
//			System.out.println();
//		}		
		
//		print country Italy related text from the table
				
		for (int i=2;i<=row;i++) {
				String value=driver.findElement(By.xpath("//tbody[@style='box-sizing:inherit']//tr["+i+"]//td[3]//span")).getText();
			if (value.contains("Italy")) {
				for (int c=1;c<=column;c++) {
					String valuei=driver.findElement(By.xpath("//tbody[@style='box-sizing:inherit']//tr["+i+"]//td["+c+"]//span")).getText();
					System.out.println(valuei+"\t");
				}
			}
			
		}
		
		
		
	}
}
