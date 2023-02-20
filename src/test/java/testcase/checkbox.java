package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class checkbox extends initial {
	loginpage loginpages = new loginpage();

	@Test
	public void radio() throws InterruptedException, IOException {
		PageFactory.initElements(driver, loginpages);

		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(5000);
		loginpage.testconfiguration.click();
		Thread.sleep(2000);
		loginpage.testconfigure.click();

		boolean actual = loginpage.checkbox.isDisplayed();
		boolean expected = true;
		boolean button = true;
		testCase = extent.createTest("1.visiblity");
		try {
			AssertJUnit.assertEquals(expected, actual);
		} catch (AssertionError e) {
			button = false;
		}

		if (button) {
			testCase.log(Status.INFO, "actualvalue is :" + actual);
			testCase.log(Status.INFO, "expectedvalue is :" + expected);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actual);
			testCase.log(Status.INFO, "expectedvalue is :" + expected);
			testCase.log(Status.FAIL, "wrong");
		}

		boolean actualenable = loginpage.checkbox.isEnabled();
		boolean expectedenable = true;
		boolean enable = true;
		testCase = extent.createTest("2.Enable");
		try {
			AssertJUnit.assertEquals(expectedenable, actualenable);
		} catch (AssertionError e) {
			enable = false;
		}

		if (enable) {
			testCase.log(Status.INFO, "actualvalue is :" + actualenable);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedenable);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualenable);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedenable);
			testCase.log(Status.FAIL, "wrong");
		}

		String actualcursor = loginpage.checkbox.getCssValue("cursor");
		String expectedcursor = "pointer";
		boolean cursor = true;
		testCase = extent.createTest("3.cursor");
		try {
			AssertJUnit.assertEquals(expectedcursor, actualcursor);
		} catch (AssertionError e) {
			enable = false;
		}

		if (enable) {
			testCase.log(Status.INFO, "actualvalue is :" + actualcursor);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedcursor);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualcursor);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedcursor);
			testCase.log(Status.FAIL, "wrong");
		}

		Dimension size = loginpage.checkbox.getSize();
		int actualwidth = size.getWidth();
		int expectedwidth = 100;
		boolean width = true;
		testCase = extent.createTest("4.width");
		try {
			AssertJUnit.assertEquals(expectedwidth, actualwidth);
		} catch (AssertionError e) {
			width = false;
		}

		if (width) {
			testCase.log(Status.INFO, "actualvalue is :" + actualwidth);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedwidth);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualwidth);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedwidth);
			testCase.log(Status.FAIL, "wrong");
		}

		int actualheight = size.getHeight();
		int expectedheight = 100;
		boolean height = true;
		testCase = extent.createTest("5.height");
		try {
			AssertJUnit.assertEquals(expectedheight, actualheight);
		} catch (AssertionError e) {
			height = false;
		}

		if (height) {
			testCase.log(Status.INFO, "actualvalue is :" + actualheight);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedheight);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualheight);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedheight);
			testCase.log(Status.FAIL, "wrong");
		}

		String actualpadding = loginpage.checkbox.getCssValue("padding");
		String expectedpadding = "0px";
		boolean padding = true;
		testCase = extent.createTest("6.padding");
		try {
			AssertJUnit.assertEquals(expectedpadding, actualpadding);
		} catch (AssertionError e) {
			padding = false;
		}

		if (padding) {
			testCase.log(Status.INFO, "actualvalue is :" + actualpadding);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedpadding);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualpadding);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedpadding);
			testCase.log(Status.FAIL, "wrong");
		}

		//boolean actualselect = driver.findElement(By.xpath("//*[@id=\"active\"]")).isSelected();
		boolean actualselect = loginpage.checkbox.isSelected();
		System.out.println("actual:"+actualselect);
		Thread.sleep(2000);
		loginpage.checkbox.click();
		Thread.sleep(4000);
		boolean expectselect = loginpage.checkbox.isSelected();
		System.out.println("actual:"+actualselect);
		System.out.println("Expected:"+expectselect);
		testCase = extent.createTest("functionality");
		if (actualselect) {
			if (!expectselect) {
				testCase.log(Status.INFO, "actualvalue is :" + actualselect );
				testCase.log(Status.INFO, "expectedvalue is :" + expectselect);
				testCase.log(Status.PASS, "correct");
			} else {
				testCase.log(Status.INFO, "actualvalue is :" +actualselect );
				testCase.log(Status.INFO, "expectedvalue is :" + expectselect);
				testCase.log(Status.FAIL, "wrong");
			}
		} else if (!actualselect) {
			if (expectselect) {
				testCase.log(Status.INFO, "actualvalue is :" + actualselect );
				testCase.log(Status.INFO, "expectedvalue is :" + expectselect);
				testCase.log(Status.PASS, "correct");
			} else {
				testCase.log(Status.INFO, "actualvalue is :" + actualselect );
				testCase.log(Status.INFO, "expectedvalue is :" + expectselect);
				testCase.log(Status.FAIL, "wrong");
			}
		}
		String actualposition = loginpage.checkbox.getCssValue("postion");
		String expectedposition = "0px";
		boolean position = true;
		testCase = extent.createTest("7.position");
		try {
			AssertJUnit.assertEquals(expectedpadding, actualposition);
		} catch (AssertionError e) {
			padding = false;
		}

		if (padding) {
			testCase.log(Status.INFO, "actualvalue is :" + actualpadding);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedpadding);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualpadding);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedpadding);
			testCase.log(Status.FAIL, "wrong");
		}

	}

}
