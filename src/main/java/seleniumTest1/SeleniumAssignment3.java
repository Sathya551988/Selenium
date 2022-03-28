package seleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment3 {
	  
	 public static void performAction(String firstName, String LastName) {
		   
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
			
			WebElement findNameText = driver.findElement(By.name("firstname"));
			  findNameText.sendKeys(firstName);
			 
			driver.findElement(By.name("lastname")).sendKeys(LastName);
			driver.findElement(By.xpath("//input[@value='Female']")).click();
			driver.findElement(By.xpath("//input[@name='exp' and @value='2']")).click();
			driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
			driver.findElement(By.xpath("//input[@name='tool' and @value='Selenium Webdriver']")).click();
			driver.findElement(By.xpath("//option[. = 'North America']")).click();
			driver.findElement(By.xpath("//option[. = 'Navigation Commands']")).click();
			driver.findElement(By.xpath("//option[. = 'Wait Commands']")).click();
		    driver.findElement(By.name("submit")).click();
			
			
		   }
		    
		    public static void main(String[] args) {
		    	
		    	performAction("Pratiksha", "sathishkumar");
		    	
			}
		}


