package seleniumTest1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Hospital {

	public WebDriver driver;

	@Test
	public void selectZone() throws InterruptedException {

		driver = new ChromeDriver();

		try {
			driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");
		

			for (int i = 2; i <= 10; i++) {
				/* Select Zone */
				Select zones = new Select(driver.findElement(By.id("ddlZone")));
				zones.selectByValue("" + i);
				/* Select Hospital */
				Select facility = new Select(driver.findElement(By.id("ddlFacilityType")));
				facility.selectByValue("1");

				/* get all Hospitals by class card custom-card */
				List<WebElement> cardHearder = driver.findElements(By.cssSelector(".card.custom-card"));
				for (WebElement webElement : cardHearder) {

					// webElement.findElement(By.className("hospital-info")).getText());
					/** Print Hospital Info */

					webElement.findElement(By.className("hospital-info")).click();
					Thread.sleep(1000);
					System.out.println("Hospital Name: " + driver.findElement(By.id("lblhosname")).getText());
					System.out.println("Address: " + driver.findElement(By.id("lblhosaddress")).getText());
					System.out.println("Contact: " + driver.findElement(By.id("lblhosCno")).getText());
					driver.findElement(By.className("close")).click();

					System.out.println(webElement.findElement(By.className("count-text")).getText());
					System.out.println(webElement.findElement(By.cssSelector(".count-text.pr-2")).getText());

					Thread.sleep(1000);
					WebElement ul = webElement.findElement(By.tagName("ul"));
					List<WebElement> ele = ul.findElements(By.tagName("li"));
					for (WebElement li : ele) {
						System.out.print(li.findElement(By.className("caption-text")).getText() + " -- ");
						System.out.print(li.findElement(By.className("count-text")).getText());
						System.out.println();
					}

				}
			}
		}

		// catch (InterruptedException e) {
		// Thread.currentThread().interrupt(); //set the flag back to }

		finally {

			driver.quit();
		}
	}
}
