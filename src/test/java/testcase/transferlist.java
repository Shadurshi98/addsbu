package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class transferlist extends initial {
	loginpage loginpages = new loginpage();

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

	@Test

	public void transferlist() throws InterruptedException, IOException {

		try {

			String content1 = driver
					.findElement(By.xpath("//*[@id=\"components-transfer-demo-basic\"]/section[1]/div/div[1]"))
					.getText();
			System.out.print(content1);
			// Tabsfull = content1.split("\n");
			boolean pass = content1.contains("content");
			System.out.println("test - Contains Data status :- " + pass);
			TestCasePrint("TRANSFER LIST - CHECK DATA", "true", String.valueOf(pass));
		} catch (AssertionError e) {
			TestCasePrint("TRANSFER LIST - CHECK DATA", "true", String.valueOf(e));
		}

		try

		{
			boolean visibility = driver.findElement(By.xpath("//*[@id=\"components-transfer-demo-basic\"]/section[1]"))
					.isDisplayed();
			System.out.println(visibility);
			TestCasePrint("visiblitiy", "true", String.valueOf(visibility));
		}

		catch (Exception e) {
			TestCasePrint("visiblity", "true", String.valueOf(e));
		}
		
		
		try {
			Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[1]/div[2]/ul/li[1]/span")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[2]/button[1]")).click();

		}
		
		catch(Exception e) {
			
		}
		
		
		
	}
}