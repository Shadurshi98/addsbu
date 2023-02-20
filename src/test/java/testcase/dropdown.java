package testcase;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class dropdown extends initial {
	loginpage loginpages = new loginpage();

	@Test
	public void drop() throws InterruptedException, IOException {
		PageFactory.initElements(driver, loginpages);

		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(5000);
		loginpage.testconfiguration.click();
		Thread.sleep(2000);
		loginpage.testconfigure.click();
		loginpage.dropdown.click();
		// Thread.sleep(2000);
		
		
		//enable//
		try {
			boolean actualdropdown = loginpage.dropdown.isEnabled();
			boolean expecteddropdown = true;
			boolean exist = true;

			testCase = extent.createTest("1.dropdown is enable");

			try {
				AssertJUnit.assertEquals(expecteddropdown, actualdropdown);
			} catch (AssertionError e) {
				exist = false;
			}
			if (exist) {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown :- " + expecteddropdown);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown:- " + expecteddropdown);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}

		//display//
		
		try {
			boolean actualdropdown = loginpage.dropdown.isDisplayed();
			boolean expecteddropdown = true;
			boolean exist = true;

			testCase = extent.createTest("2.dropdown visiblity");

			try {
				AssertJUnit.assertEquals(expecteddropdown, actualdropdown);
			} catch (AssertionError e) {
				exist = false;
			}
			if (exist) {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown :- " + expecteddropdown);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown:- " + expecteddropdown);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		
		//width//
		try {
			Dimension size = loginpage.checkbox.getSize();
			System.out.println("print size"+ size);
			int actualwidth = size.getWidth();
			int expectedwidth = 100;
			boolean width = true;
			testCase = extent.createTest("3.width");
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
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");

		}
		
		//height//
		try {
			Dimension size = loginpage.checkbox.getSize();
			int actualheight = size.getHeight();
			int expectedheight = 32;
			boolean height = true;
			testCase = extent.createTest("4.height");
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
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");

		}
		
		//background-color//
		try {
			String actualdropdown = loginpage.dropdown.getCssValue("background-color");
			String hex =Color.fromString(actualdropdown).asHex();
			String expecteddropdown ="#00000000";
			boolean exist = true;

			testCase = extent.createTest("5.background-color");

			try {
				AssertJUnit.assertEquals(expecteddropdown, hex);
			} catch (AssertionError e) {
				exist = false;
			}
			if (exist) {
				testCase.log(Status.INFO, "actualdropdown :- " + hex);
				testCase.log(Status.INFO, "expecteddropdown :- " + expecteddropdown);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "actualdropdown :- " + hex);
				testCase.log(Status.INFO, "expecteddropdown:- " + expecteddropdown);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		
		try {
			String actualdropdown = loginpage.dropdown.getCssValue("color");
			String hex =Color.fromString(actualdropdown).asHex();
			String expecteddropdown ="#00000000";
			boolean exist = true;

			testCase = extent.createTest("6.font-color");

			try {
				AssertJUnit.assertEquals(expecteddropdown, hex);
			} catch (AssertionError e) {
				exist = false;
			}
			if (exist) {
				testCase.log(Status.INFO, "actualdropdown :- " + hex);
				testCase.log(Status.INFO, "expecteddropdown :- " + expecteddropdown);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "actualdropdown :- " + hex);
				testCase.log(Status.INFO, "expecteddropdown:- " + expecteddropdown);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		
		try {
			String actualdropdown = loginpage.dropdown.getCssValue("border-color");
			String hex =Color.fromString(actualdropdown).asHex();
			String expecteddropdown ="#00000000";
			boolean exist = true;

			testCase = extent.createTest("7.border-color");

			try {
				AssertJUnit.assertEquals(expecteddropdown, hex);
			} catch (AssertionError e) {
				exist = false;
			}
			if (exist) {
				testCase.log(Status.INFO, "actualdropdown :- " + hex);
				testCase.log(Status.INFO, "expecteddropdown :- " + expecteddropdown);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "actualdropdown :- " + hex);
				testCase.log(Status.INFO, "expecteddropdown:- " + expecteddropdown);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		try {
			String actualdropdown = loginpage.dropdown.getText();
			String expecteddropdown = "Enter Type";
			boolean exist = true;

			testCase = extent.createTest("8.placeholder spelling");

			try {
				AssertJUnit.assertEquals(expecteddropdown, actualdropdown);
			} catch (AssertionError e) {
				exist = false;
			}
			if (exist) {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown :- " + expecteddropdown);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown:- " + expecteddropdown);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		try {
			String actualdropdown = loginpage.dropdown.getCssValue("cursor");
			String expecteddropdown = "pointer";
			boolean exist = true;

			testCase = extent.createTest("9.cursor");

			try {
				AssertJUnit.assertEquals(expecteddropdown, actualdropdown);
			} catch (AssertionError e) {
				exist = false;
			}
			if (exist) {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown :- " + expecteddropdown);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "actualdropdown :- " + actualdropdown);
				testCase.log(Status.INFO, "expecteddropdown:- " + expecteddropdown);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		String actualdropdownt = loginpage.dropdown.getCssValue("margin");
		System.out.println("font-style -" +actualdropdownt);
	}

}