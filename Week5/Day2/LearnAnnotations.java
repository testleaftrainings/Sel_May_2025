package week5.day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass executed");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest executed");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite executed");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod executed");

	}

	@Test
	public void createLead() {
		System.out.println("createLead executed");

	}

	@Test
	public void editLead() {
		System.out.println("editLead executed");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest executed");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass executed");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod executed");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite executed");

	}

}
