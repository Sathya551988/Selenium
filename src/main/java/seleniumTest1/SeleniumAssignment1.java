package seleniumTest1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumAssignment1 {
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("Hello I am executing Before Suite");
	}
	
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("Hello I am executing After Suite");
	}
	
	@Test
	public void firstTest() {
		System.out.println("Executing First Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Hello I am executing Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Hello I am executing After Test");
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Hello I am executing Before Groups");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("Hello I am executing After Groups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Hello I am executing Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Hello I am executing After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hello I am executing Before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Hello I am executing After method");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Executing Second Test");
	}
	
	
	
	
	
}
