package testcase;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class tabs extends initial {
	loginpage loginpages = new loginpage();

	@Test
	public void tabs() throws InterruptedException, IOException {
		PageFactory.initElements(driver, loginpages);
		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(5000);
		loginpage.master.click();

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
	public void testcase() throws InterruptedException, IOException {
		try {
			String ExpectedValue = "[Plant, Equipment, Material, Customer, Supplier, Employee]";
			String TabItems = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul")).getText();
			String[] Tabsfull = TabItems.split("\n");
			int newLength = Tabsfull.length -1;
			String[] Tabs = Arrays.copyOf(Tabsfull, newLength);
			String value = Arrays.toString(Tabs);

			System.out.println("print" + value);

			TestCasePrint("TAB - TEST TAB NAMES", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST TAB NAMES", "[Plant, Equipment, Material, Customer, Supplier, Employee]",
					String.valueOf(e));
		}
	}
}
