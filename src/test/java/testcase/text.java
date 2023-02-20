package testcase;

import java.io.IOException;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class text extends initial{
loginpage loginpages =new loginpage();
	@Test
	public void text() throws InterruptedException, IOException{
		PageFactory.initElements(driver, loginpages);
		
		try {
			boolean actuallink = loginpage.logintitle.isDisplayed();
			boolean expectedlink = true;
			boolean link =true;
			testCase=extent.createTest("1.text is visible");
			
			try {
				AssertJUnit.assertEquals(expectedlink, actuallink);
			}
			catch (AssertionError e){
				link = false;
			}
			
			if (link) {
				testCase.log(Status.INFO, "actualvalue is :" +actuallink );
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
				testCase.log(Status.PASS, "text is displayed");
			} else {

				testCase.log(Status.INFO, "actualvalue is :" + actuallink);
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
				testCase.log(Status.FAIL, "text not displayed");
			}
			}
			catch (Exception e) {
				
				testCase= extent.createTest("element identification");
				testCase.log(Status.FAIL, "no element");
			}
			
		
		try {
			String actuallink = loginpage.logintitle.getCssValue("color");
			String hex = Color.fromString(actuallink).asHex();
			String expectedlink = "#000";
			boolean link =true;
			testCase=extent.createTest("2.text color");
			
			try {
				AssertJUnit.assertEquals(expectedlink, hex);
			}
			catch (AssertionError e){
				link = false;
			}
			
			if (link) {
				testCase.log(Status.INFO, "actualvalue is :" +hex );
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
				testCase.log(Status.PASS, "correct color");
			} else {

				testCase.log(Status.INFO, "actualvalue is :" + hex);
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
				testCase.log(Status.FAIL, "wrong color");
			}
			}
			catch (Exception e) {
				
				testCase= extent.createTest("element identification");
				testCase.log(Status.FAIL, "no element");
			}
		
		try {
			String actuallink = loginpage.logintitle.getCssValue("font-family");
			System.out.println(actuallink);
			String expectedlink = "Charcoal, sans-serif";
			boolean link =true;
			testCase=extent.createTest("3.font-family");
			
			try {
				AssertJUnit.assertEquals(expectedlink, actuallink);
			}
			catch (AssertionError e){
				link = false;
			}
			
			if (link) {
				testCase.log(Status.INFO, "actualvalue is :" +actuallink );
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
				testCase.log(Status.PASS, "correct font family");
			} else {

				testCase.log(Status.INFO, "actualvalue is :" + actuallink);
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlink);
				testCase.log(Status.FAIL, "wrong fot family");
			}
			}
			catch (Exception e) {
				
				testCase= extent.createTest("element identification");
				testCase.log(Status.FAIL, "no element");
			}
		try {
			String actuallinktext = loginpage.logintitle.getText();
			String expectedlinkcolor = "LOGIN TO YOUR ACCOUNT";
			boolean link =true;
			testCase=extent.createTest("4.spelling");
			
			try {
				AssertJUnit.assertEquals(expectedlinkcolor,actuallinktext);
			}
			catch (AssertionError e){
				link = false;
			}
			
			if (link) {
				testCase.log(Status.INFO, "actualvalue is :" +actuallinktext );
				testCase.log(Status.INFO, "expectedvalue is :" +expectedlinkcolor);
				testCase.log(Status.PASS, "correct spelling");
			} else {

				testCase.log(Status.INFO, "actualvalue is :" +actuallinktext);
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlinkcolor);
				testCase.log(Status.FAIL, "wrong ");
			}
			}
			catch (Exception e) {
				
				testCase= extent.createTest("element identification");
				testCase.log(Status.FAIL, "no element");
			}
		
		try {
			String actuallinktext = loginpage.logintitle.getCssValue("font-size");
			String expectedlinkcolor = "18px";
			boolean link =true;
			testCase=extent.createTest("5.font-size");
			
			try {
				AssertJUnit.assertEquals(expectedlinkcolor,actuallinktext);
			}
			catch (AssertionError e){
				link = false;
			}
			
			if (link) {
				testCase.log(Status.INFO, "actualvalue is :" +actuallinktext );
				testCase.log(Status.INFO, "expectedvalue is :" +expectedlinkcolor);
				testCase.log(Status.PASS, "correct ");
			} else {

				testCase.log(Status.INFO, "actualvalue is :" +actuallinktext);
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlinkcolor);
				testCase.log(Status.FAIL, "wrong ");
			}
			}
			catch (Exception e) {
				
				testCase= extent.createTest("element identification");
				testCase.log(Status.FAIL, "no element");
			}
		
		try {
			String actuallinktext = loginpage.logintitle.getCssValue("opacity");
			String expectedlinkcolor = "1";
			boolean link =true;
			testCase=extent.createTest("6.opacity");
			
			try {
				AssertJUnit.assertEquals(expectedlinkcolor,actuallinktext);
			}
			catch (AssertionError e){
				link = false;
			}
			
			if (link) {
				testCase.log(Status.INFO, "actualvalue is :" +actuallinktext );
				testCase.log(Status.INFO, "expectedvalue is :" +expectedlinkcolor);
				testCase.log(Status.PASS, "correct ");
			} else {

				testCase.log(Status.INFO, "actualvalue is :" +actuallinktext);
				testCase.log(Status.INFO, "expectedvalue is :" + expectedlinkcolor);
				testCase.log(Status.FAIL, "wrong ");
			}
			}
			catch (Exception e) {
				
				testCase= extent.createTest("element identification");
				testCase.log(Status.FAIL, "no element");
			}
		
		String actualdropdownt = loginpage.logintitle.getCssValue("overflow");
		System.out.println("font-style -" +actualdropdownt);
	}
	}

