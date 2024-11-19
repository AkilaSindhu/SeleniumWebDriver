package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


class Dog implements Animal1{

	public void wild() {
		
	}
	
	@Override
	public void testing2() {
		System.out.println("testing2");
		
	}

	@Override
	public void testing3() {
		System.out.println("testing3");
		
	}

	@Override
	public void testing1() {
		// TODO Auto-generated method stub
		System.out.println("testing1");
	}
}


public class Husky extends InternetExplorerDriver{
	
	public void testing4() {
		System.out.println("wild life");
	}
	
//	@Override
//	public void testing3() {
//		System.out.println("new testing3");
//	}

	public static void main(String[] args) {
		
//		Animal1 driver = new Husky();
//		driver.testing1();
//		driver.testing3();
		
		Husky dr = new Husky();
		dr.assertOnWindows();
		dr.quit();
		
		
//	
//	WebDriver driver1 = new InternetExplorerDriver();
	InternetExplorerDriver driver1 = new InternetExplorerDriver();
	
	
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.amazon.com/");
//	//self
//	System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Today')] /self::a")).getText());
//	//parent
//	System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Today')] /parent::div")).getText());
//	//child
//	System.out.println(driver.findElement(By.xpath("//*[contains(@id,'nav-xshop')]/child::a")).getText());
//	//child 2
//	System.out.println(driver.findElement(By.xpath("//*[contains(@id,'nav-xshop')]/child::a[2]")).getText());
//	//following-sibing
//	System.out.println(driver.findElement(By.xpath("//*[contains(@id,'nav-hamburger-menu')]//following-sibling::span")).getText());
//	//preceding-sibing
//	System.out.println(driver.findElement(By.xpath("//*[@class='hm-icon-label']//preceding-sibling::i")).isDisplayed());
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
