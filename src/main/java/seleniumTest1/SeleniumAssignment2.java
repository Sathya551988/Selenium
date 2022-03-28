package seleniumTest1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumAssignment2 {
	
	
	
	public static void testCase2(String firstName, String lastName) {
		
		WebDriver chromedriver =new ChromeDriver();
		chromedriver.get("https://cosmocode.io/automation-practice/");
		
		WebElement findNameText = chromedriver.findElement(By.id("firstname"));
		  findNameText.sendKeys(firstName);
		  chromedriver.findElement(By.className("lastname")).sendKeys(lastName);
		
		  chromedriver.findElement(By.linkText("Click Me to open New Window")).click(); 
	    chromedriver.findElement(By.partialLinkText("change-random-digit-123")).click(); 
		
	    //chromedriver.findElement(By.partialLinkText("Click Me to")).click(); 
		//  chromedriver.close(); 
		
		  chromedriver.findElement(By.xpath("//input[@value='Female']")).click();
		  chromedriver.findElement(By.name("language_java")).click();
		  chromedriver.findElement(By.name("language_python")).click();
		  chromedriver.findElement(By.name("age")).sendKeys("Under 30");
		  
		  chromedriver.findElement(By.id("submit_htmlform")).click();
	}
	
	
	public static void  main(String[] args) {
		testCase2("sathya","sathishkumar");
	}
	
	
}
