package javatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaTest1 {
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
