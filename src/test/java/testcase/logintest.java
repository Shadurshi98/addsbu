package testcase;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class logintest extends initial {
	loginpage loginpages = new loginpage();

	@Test
	public void login() throws InterruptedException, IOException {
		PageFactory.initElements(driver, loginpages);

		Thread.sleep(2000);
		boolean actualelement = loginpage.loginbutton.isDisplayed();
		boolean expectedelement = true;
		boolean elementvisible = true;
		testCase = extent.createTest("1.element visibility");
		try {
			AssertJUnit.assertEquals(expectedelement, actualelement);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "actualvalue is :" + actualelement);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedelement);
			testCase.log(Status.PASS, "element is displayed");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualelement);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedelement);
			testCase.log(Status.FAIL, "element not displayed");
		}

		Thread.sleep(2000);

		String actualbackgroundcolor = loginpage.loginbutton.getCssValue("background-color");
		String hex = Color.fromString(actualbackgroundcolor).asHex();
		System.out.println("backgroundcolor -" + hex);
		String bgc = "#0f2e43";
		boolean backgroundcolor = true;

		testCase = extent.createTest("2.button color");
		try {
			AssertJUnit.assertEquals(hex, bgc);
		} catch (AssertionError e) {
			backgroundcolor = false;
		}
		if (backgroundcolor) {
			testCase.log(Status.INFO, "actualbackgroundcolor -" + hex);
			testCase.log(Status.INFO, "expectedbackgroundcolor -" + bgc);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualbackgroundcolor -" + hex);
			testCase.log(Status.INFO, "expectedbackgroundcolor -" + bgc);
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(2000);

		String actualfont = loginpage.loginbutton.getCssValue("color");
		String fontcolor = Color.fromString(actualfont).asHex();
		System.out.println("font color of button -" + fontcolor);
		String expectedfontcolor = "#ffffff";
		boolean color = true;
		testCase = extent.createTest("3.fontcolor");
		try {
			AssertJUnit.assertEquals(expectedfontcolor, fontcolor);
		} catch (AssertionError e) {
			color = false;

		}
		if (color) {

			testCase.log(Status.INFO, "actualfontcolor -" + fontcolor);
			testCase.log(Status.INFO, "expectedfontcolor -" + expectedfontcolor);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualfontcolor -" + fontcolor);
			testCase.log(Status.INFO, "expectedfontcolor -" + expectedfontcolor);
			testCase.log(Status.FAIL, "wrong");
		}
		Dimension size = loginpage.loginbutton.getSize();
		int actualwidth = size.getWidth();
		System.out.println("width of the button -" + actualwidth);
		int expectedwidth = 122;
		testCase = extent.createTest("4.button width");
		boolean width = true;
		try {
			AssertJUnit.assertEquals(expectedwidth, actualwidth);

		} catch (AssertionError e) {
			width = false;
		}
		if (width) {

			testCase.log(Status.INFO, "actualwidth -" + actualwidth);
			testCase.log(Status.INFO, "expectedwidth -" + expectedwidth);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualwidth -" + actualwidth);
			testCase.log(Status.INFO, "expectedwidth -" + expectedwidth);
			testCase.log(Status.FAIL, "wrong");
		}

		int actualheight = size.getHeight();
		System.out.println("height of the button -" + actualheight);
		int expectedheight = 38;
		testCase = extent.createTest("5.button height");
		boolean height = true;
		try {
			AssertJUnit.assertEquals(expectedheight, actualheight);

		} catch (AssertionError e) {
			height = false;
		}
		if (height) {

			testCase.log(Status.INFO, "actualheight -" + actualheight);
			testCase.log(Status.INFO, "expectedheight -" + expectedheight);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualheight -" + actualheight);
			testCase.log(Status.INFO, "expectedheight -" + expectedheight);
			testCase.log(Status.FAIL, "wrong");
		}

//	      Point position = loginpage.loginbutton.getLocation();
//	      int x = position.getX();
//	      int y = position.getY();
//	      
//	      System.out.println("x axis -" + x);
//	      System.out.println("y axis -"+ y);
//	      
//	      point expectedpoint = new point

		boolean actualelementenable = loginpage.loginbutton.isEnabled();
		boolean expectedelementenable = true;
		boolean elementenable = true;
		testCase = extent.createTest("6.element enable");
		try {
			AssertJUnit.assertEquals(expectedelementenable, actualelementenable);
		} catch (AssertionError e) {
			elementenable = false;
		}
		if (elementenable) {
			testCase.log(Status.INFO, "actualvalue is :" + actualelementenable);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedelementenable);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actualelementenable);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedelementenable);
			testCase.log(Status.FAIL, "element disabled");
		}

		String actaulfontsize = loginpage.loginbutton.getCssValue("font-size");
		String expectedfontsize = "14px";
		boolean fontsize = true;
		testCase = extent.createTest("7.fontsize");
		try {
			AssertJUnit.assertEquals(actaulfontsize, expectedfontsize);
		} catch (AssertionError e) {
			fontsize = false;
		}
		if (fontsize) {
			testCase.log(Status.INFO, "actualvalue is :" + actaulfontsize);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedfontsize);
			testCase.log(Status.PASS, "correct");
		} else {

			testCase.log(Status.INFO, "actualvalue is :" + actaulfontsize);
			testCase.log(Status.INFO, "expectedvalue is :" + expectedfontsize);
			testCase.log(Status.FAIL, "wrong");
		}
		String actualspelling = loginpage.loginbutton.getText();
		String expectedspelling = "Login";
		boolean spelling = true;
		testCase = extent.createTest("8.spelling");
		try {
			AssertJUnit.assertEquals(expectedspelling, actualspelling);
		} catch (AssertionError e) {
			spelling = false;

		}
		if (spelling) {

			testCase.log(Status.INFO, "actualspelling -" + actualspelling);
			testCase.log(Status.INFO, "expectedspelling -" + expectedspelling);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualspelling -" + actualspelling);
			testCase.log(Status.INFO, "expectedspelling -" + expectedspelling);
			testCase.log(Status.FAIL, "wrong");
		}

		String actualbordercolor = loginpage.loginbutton.getCssValue("border-color");
		String bodcolor = Color.fromString(actualbordercolor).asHex();
		System.out.println("font color of button -" + bodcolor);
		String expectedbordercolor = "#d9d9d9";
		boolean bordercolor = true;
		testCase = extent.createTest("9.border-color");
		try {
			AssertJUnit.assertEquals(expectedbordercolor, bodcolor);
		} catch (AssertionError e) {
			bordercolor = false;

		}
		if (bordercolor) {

			testCase.log(Status.INFO, "actualbordercolor -" + bodcolor);
			testCase.log(Status.INFO, "expectedbordercolor -" + expectedbordercolor);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualbordercolor -" + bodcolor);
			testCase.log(Status.INFO, "expectedbordercolor -" + expectedbordercolor);
			testCase.log(Status.FAIL, "wrong");
		}

		
		String actualfonttype = loginpage.loginbutton.getCssValue("font-family");
		String expectedfonttype = "inherit";
		boolean style = true;
		testCase = extent.createTest("9.font-family");
		try {
			AssertJUnit.assertEquals(expectedfonttype,actualfonttype);
		} catch (AssertionError e) {
			style = false;

		}
		if (style) {

			testCase.log(Status.INFO, "actualfontfamily -" + actualfonttype);
			testCase.log(Status.INFO, "expectedfontfamily -" + expectedfonttype);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualfontfamily -" + actualfonttype);
			testCase.log(Status.INFO, "expectedfontfamily -" + expectedfonttype);
			testCase.log(Status.FAIL, "wrong");
		}
		
		String actualborderradius = loginpage.loginbutton.getCssValue("border-radius");
		String expectedborederradius = "90px";
		boolean radius = true;
		testCase = extent.createTest("10.border-radius");
		try {
			AssertJUnit.assertEquals(expectedborederradius,actualborderradius);
		} catch (AssertionError e) {
			radius = false;

		}
		if (radius) {

			testCase.log(Status.INFO, "actualfontfamily -" + actualborderradius);
			testCase.log(Status.INFO, "expectedfontfamily -" + expectedborederradius);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualfontfamily -" + actualborderradius);
			testCase.log(Status.INFO, "expectedfontfamily -" + expectedborederradius);
			testCase.log(Status.FAIL, "wrong");
		}
		
		
		String actualfontweight = loginpage.loginbutton.getCssValue("font-weight");
		String expectedfontweight = "400";
		boolean weight = true;
		testCase = extent.createTest("11.font-weight");
		try {
			AssertJUnit.assertEquals(expectedfontweight,actualfontweight);
		} catch (AssertionError e) {
			weight = false;

		}
		if (weight) {

			testCase.log(Status.INFO, "actualfontfamily -" + actualfontweight);
			testCase.log(Status.INFO, "expectedfontfamily -" +expectedfontweight);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualfontfamily -" + actualfontweight);
			testCase.log(Status.INFO, "expectedfontfamily -" + expectedfontweight);
			testCase.log(Status.FAIL, "wrong");
		}
		
		
		String actual = loginpage.loginbutton.getCssValue("cursor");
		String expected = "pointer";
		boolean cursor = true;
		testCase = extent.createTest("12.cursor");
		try {
			AssertJUnit.assertEquals(expectedfontweight,actualfontweight);
		} catch (AssertionError e) {
			cursor = false;

		}
		if (cursor) {

			testCase.log(Status.INFO, "actualfontfamily -" + actual);
			testCase.log(Status.INFO, "expectedfontfamily -" +expected);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualfontfamily -" + actual);
			testCase.log(Status.INFO, "expectedfontfamily -" + expected);
			testCase.log(Status.FAIL, "wrong");
		}
		
		String actualpadding = loginpage.loginbutton.getCssValue("padding");
		String expectedpadding = "4px 15px";
		boolean padding = true;
		testCase = extent.createTest("13.padding");
		try {
			AssertJUnit.assertEquals(expectedpadding,actualpadding);
		} catch (AssertionError e) {
			padding = false;

		}
		if (padding) {

			testCase.log(Status.INFO, "actualfontfamily -" + actualpadding);
			testCase.log(Status.INFO, "expectedfontfamily -" +expectedpadding);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualfontfamily -" + actualpadding);
			testCase.log(Status.INFO, "expectedfontfamily -" + expectedpadding);
			testCase.log(Status.FAIL, "wrong");
		}
		
		
		String actualopacity = loginpage.loginbutton.getCssValue("opacity");
		String expectedopacity = ".35";
		boolean opacity = true;
		testCase = extent.createTest("14.opacity");
		try {
			AssertJUnit.assertEquals(expectedopacity,actualopacity);
		} catch (AssertionError e) {
			opacity = false;

		}
		if (opacity) {

			testCase.log(Status.INFO, "actualopacity -" + actualopacity);
			testCase.log(Status.INFO, "expectedopacity -" +expectedopacity);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualopacity-" + actualopacity);
			testCase.log(Status.INFO, "expectedopacity -" +expectedopacity);
			testCase.log(Status.FAIL, "wrong");
		}
		
		String actualboxshadow = loginpage.loginbutton.getCssValue("box-shadow");
		String expectedboxshadow = "0 2px 0 rgb(0 0 0 / 2%)";
		boolean shadow = true;
		testCase = extent.createTest("15.box-shadow");
		try {
			AssertJUnit.assertEquals(expectedboxshadow,actualboxshadow);
		} catch (AssertionError e) {
			shadow = false;

		}
		if (shadow) {

			testCase.log(Status.INFO, "actualopacity -" + actualboxshadow);
			testCase.log(Status.INFO, "expectedopacity -" +expectedboxshadow);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "actualopacity-" +actualboxshadow);
			testCase.log(Status.INFO, "expectedopacity -" +expectedboxshadow);
			testCase.log(Status.FAIL, "wrong");
		}
	}

}
