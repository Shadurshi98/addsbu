package testcase;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable;
import pages.loginpage;

public class link extends initial {
	loginpage loginpages = new loginpage();

@Test
public void link() throws InterruptedException ,IOException{
	PageFactory.initElements(driver, loginpages);
	try {
	boolean actuallink = loginpage.forget.isDisplayed();
	boolean expectedlink = true;
	boolean link =true;
	testCase=extent.createTest("link is visible");
	
	try {
		AssertJUnit.assertEquals(expectedlink, actuallink);
	}
	catch (AssertionError e){
		link = false;
	}
	
	if (link) {
		testCase.log(Status.INFO, "actualvalue is :" +actuallink );
		testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
		testCase.log(Status.PASS, "forget-link is displayed");
	} else {

		testCase.log(Status.INFO, "actualvalue is :" + actuallink);
		testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
		testCase.log(Status.FAIL, "forget-link not displayed");
	}
	}
	catch (Exception e) {
		
		testCase= extent.createTest("element identification");
		testCase.log(Status.FAIL, "no element");
	}
	
	
	
	
	try {
		String actuallinktext = loginpage.forget.getText();
		String expectedlinktext = "Forgot Password?";
		boolean link =true;
		testCase=extent.createTest("correct spelling");
		
		try {
			AssertJUnit.assertEquals(expectedlinktext, actuallinktext);
		}
		catch (AssertionError e){
			link = false;
		}
		
		if (link) {
			testCase.log(Status.INFO, "actualvalue is :" +actuallinktext );
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinktext);
			testCase.log(Status.PASS, "correct-spelling");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actuallinktext);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinktext);
			testCase.log(Status.FAIL, "wrong-spelling");
		}
		}
		catch (Exception e) {
			
			testCase= extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		
	
	try {
		boolean actuallinktext = loginpage.forget.isEnabled();
		boolean expectedlinktext = true;
		boolean link =true;
		testCase=extent.createTest("link-active");
		
		try {
			AssertJUnit.assertEquals(expectedlinktext, actuallinktext);
		}
		catch (AssertionError e){
			link = false;
		}
		
		if (link) {
			testCase.log(Status.INFO, "actualvalue is :" +actuallinktext );
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinktext);
			testCase.log(Status.PASS, "active");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actuallinktext);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinktext);
			testCase.log(Status.FAIL, "deactive");
		}
		}
		catch (Exception e) {
			
			testCase= extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
		

	try {
		String actuallinktext = loginpage.forget.getCssValue("color");
		String hex =Color.fromString(actuallinktext).asHex();
		String expectedlinkcolor = "#78e9f8";
		boolean link =true;
		testCase=extent.createTest("link-color");
		
		try {
			AssertJUnit.assertEquals(expectedlinkcolor,hex);
		}
		catch (AssertionError e){
			link = false;
		}
		
		if (link) {
			testCase.log(Status.INFO, "actualvalue is :" +hex );
			testCase.log(Status.INFO, "expectedvalue is :" +expectedlinkcolor);
			testCase.log(Status.PASS, "correct color");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + hex);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinkcolor);
			testCase.log(Status.FAIL, "wrong color");
		}
		}
		catch (Exception e) {
			
			testCase= extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
	

	try {
		String actuallinktext = loginpage.forget.getCssValue("background-color");
		String hex =Color.fromString(actuallinktext).asHex();
		String expectedlinkcolor = "#00000000";
		boolean link =true;
		testCase=extent.createTest("background-color");
		
		try {
			AssertJUnit.assertEquals(expectedlinkcolor,hex );
		}
		catch (AssertionError e){
			link = false;
		}
		
		if (link) {
			testCase.log(Status.INFO, "actualvalue is :" +hex  );
			testCase.log(Status.INFO, "expectedvalue is :" +expectedlinkcolor);
			testCase.log(Status.PASS, "correct color");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + hex );
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinkcolor);
			testCase.log(Status.FAIL, "wrong color");
		}
		}
		catch (Exception e) {
			
			testCase= extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
	
	try {
		String actuallinkalign = loginpage.forget.getCssValue("text-align");
		System.out.println(actuallinkalign);
		String expectedlinkalign = "center";
		boolean link =true;
		testCase=extent.createTest("text-align");
		
		try {
			AssertJUnit.assertEquals(expectedlinkalign,actuallinkalign );
		}
		catch (AssertionError e){
			link = false;
		}
		
		if (link) {
			testCase.log(Status.INFO, "actualvalue is :" +actuallinkalign   );
			testCase.log(Status.INFO, "expectedvalue is :" +expectedlinkalign);
			testCase.log(Status.PASS, "correct alignment");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actuallinkalign  );
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinkalign);
			testCase.log(Status.FAIL, "wrong alignment");
		}
		}
		catch (Exception e) {
			
			testCase= extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
	try {
		String actuallinkalign = loginpage.forget.getCssValue("cursor");
		System.out.println(actuallinkalign);
		String expectedlinkalign = "pointer";
		boolean link =true;
		testCase=extent.createTest("text-align");
		
		try {
			AssertJUnit.assertEquals(expectedlinkalign,actuallinkalign );
		}
		catch (AssertionError e){
			link = false;
		}
		
		if (link) {
			testCase.log(Status.INFO, "actualvalue is :" +actuallinkalign   );
			testCase.log(Status.INFO, "expectedvalue is :" +expectedlinkalign);
			testCase.log(Status.PASS, "correct alignment");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actuallinkalign  );
			testCase.log(Status.INFO, "expectedvalue is :" + expectedlinkalign);
			testCase.log(Status.FAIL, "wrong alignment");
		}
		}
		catch (Exception e) {
			
			testCase= extent.createTest("element identification");
			testCase.log(Status.FAIL, "no element");
		}
	
	try {
		loginpage.forget.click();
		Set<String> allwindows = driver.getWindowHandles();
		String testlink ="";
		if (allwindows.size()>1) {
			System.out.println("link open in new tab");
			testlink = "new tab";
				
		}
		else {
			testlink = "same tab";
			System.out.println("link opens in same tab");
		}
		String Expected = "same tab";
	

	boolean elementwindow = true;
	testCase =extent.createTest("forget-window");
	try {
		AssertJUnit.assertEquals(Expected, testlink);
	}
	catch(AssertionError e){
		elementwindow = false;
	}
	if (elementwindow) {
		testCase.log(Status.INFO, "ActualAlignment :- " + testlink);
		testCase.log(Status.INFO, "ExpectedAlignment :- " + Expected);
		testCase.log(Status.PASS, "Correct element");
	} else {
		testCase.log(Status.INFO, "ActualAlignment :- " + testlink);
		testCase.log(Status.INFO, "ExpectedAlignment :- " + Expected);
		testCase.log(Status.FAIL, "No Element");
	}
	
	}	
	catch(Exception e){
		testCase = extent.createTest("FORGET-Window");
		testCase.log(Status.FAIL, "No Element");
	}
}
}