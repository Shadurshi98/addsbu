package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class icon extends initial{
	loginpage loginpages = new loginpage();
	@Test
	public void icont() throws InterruptedException,IOException{
		PageFactory.initElements(driver, loginpages);
		
		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		

		boolean actual = loginpage.icon.isDisplayed();
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
	}

}
