package seleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlineShopping {
	public WebDriver driver;
	@Test
  public void dresses() {
	 try {
		 
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.id("search_query_top")).sendKeys("summer dress");
	driver.findElement(By.name("submit_search")).click();
    //driver.findElement(By.partialLinkText("index.php?id_product=1&controller=product")).click();
	
	 }
finally {
		driver.quit();
	} 
	
	}
}
