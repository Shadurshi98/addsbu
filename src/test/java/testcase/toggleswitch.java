package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class toggleswitch extends initial {
	loginpage loginpages = new loginpage();

	public void toggleswitch() throws InterruptedException, IOException {

		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(5000);
		loginpage.testconfiguration.click();
		Thread.sleep(2000);
		loginpage.testconfigure.click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[2]/div/div/div[2]/div[4]/div[3]/div/button")).click();
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
	@Test
	public void testcase() throws InterruptedException{
		try {
			boolean Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[2]/div/div/div[2]/div[4]/div[3]/div/button"))
					.isEnabled();
			TestCasePrint("Enable", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("enable", "true", String.valueOf(e));
		}

	}
}
