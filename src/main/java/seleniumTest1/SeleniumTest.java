package seleniumTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
		public void testcase1() {
		WebDriver chromedriver =new ChromeDriver();
		chromedriver.get("http://amazon.com");
	}
	@Test
	public void testcase2() {
		WebDriver chromedriver =new ChromeDriver();
		chromedriver.get("http://amazon.com");
	}

}
