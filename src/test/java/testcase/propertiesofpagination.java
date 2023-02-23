package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class propertiesofpagination extends initial {

	public void method1() {
		try {
			boolean Value = loginpage.pagination.isDisplayed();
			// Thread.sleep(2000);
			TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
		}
		
//		try {
//		WebElement firstPageButton=driver.findElement(By.xpath("//a[normalize-space()='1']"));
//		firstPageButton.click();
//		
//		WebElement firstArrow = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[2]/button/span"));
//		firstArrow.click();
//
//		if (firstArrow.getAttribute("class").contains("disabled")) {
//		    System.out.println("First arrow is disabled on the first page.");
//		} else {
//		    System.out.println("First arrow is not disabled on the first page.");
//		}
//		
	//	boolean fieldValue = (boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", firstArrow);
     //   System.out.println("disabled " + fieldValue);
		
//		Thread.sleep(2000);
//		boolean first = firstArrow.isDisplayed();
//		Thread.sleep(2000);
//		TestCasePrint("enability", "false", String.valueOf(first));
//
//		}

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[4]/a")).click();
		driver.navigate().refresh();
	}

	

	public static void TestCasePrint(String TestCaseName, String ExpectedValue, String ActualValue) {
		boolean position = true;
		testCase = extent.createTest(TestCaseName);
		try {
			AssertJUnit.assertEquals(ExpectedValue, ActualValue);
		} catch (AssertionError e) {
			position = false;
		}
		if (position) {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualValue);
			testCase.log(Status.INFO, "Expectedvalue :- " + ExpectedValue);
			testCase.log(Status.INFO, "Correct value");
			testCase.log(Status.PASS, "");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualValue);
			testCase.log(Status.INFO, "ExpectedValue :- " + ExpectedValue);
			testCase.log(Status.INFO, "wrong value");
			testCase.log(Status.FAIL, "");
		}

	}
}

