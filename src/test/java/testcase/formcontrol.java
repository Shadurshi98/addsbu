package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class formcontrol extends initial {

	loginpage loginpages = new loginpage();

	@Test(priority = 0)
	public void formcontrol() throws InterruptedException, IOException {

		PageFactory.initElements(driver, loginpages);

		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(5000);
		loginpage.master.click();
		loginpage.equipments.click();
		loginpage.addequipment.click();

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

	@Test(priority = 1)
	public static void testcase() throws InterruptedException {

////////--------------Test title name----------///////
		try {
			String Value = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/label"))
					.getText();
			Thread.sleep(2000);
			TestCasePrint("Test Tile Name", "* Equipment:", Value);
		} catch (Exception e) {
			TestCasePrint("Test-Tile-Name", "* Equipment:", String.valueOf(e));
		}

////////--------------placeholder name----------///////

		try {
			String Value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getAttribute("placeholder");
			TestCasePrint("placeholder-name", "Enter Equipment Name", Value);
		} catch (Exception e) {
			TestCasePrint("placeholder-name", "Enter Equipment Name", String.valueOf(e));
		}

////////--------------enable----------///////

		try {
			boolean Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.isEnabled();
			TestCasePrint("Enable", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("enable", "true", String.valueOf(e));
		}

////////----------background-color----------/////
		try {
			String color = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getCssValue("background-color");
			String Value = Color.fromString(color).asHex();
			TestCasePrint("background-color", "#ffffff", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("background-color", "#ffffff", String.valueOf(e));
		}

////////----------font-color----------/////
		try {
			String color = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getCssValue("color");
			String Value = Color.fromString(color).asHex();
			TestCasePrint("font-color", "#000000", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("font-color", "#000000", String.valueOf(e));
		}

////////----------visiblity----------/////
		try {
			boolean Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.isDisplayed();
			TestCasePrint("visiblitiy", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("visiblity", "Enter Equipment Name", String.valueOf(e));
		}
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();
	}
@Test(priority=2)
	public static void TestSpaceValidation() throws InterruptedException {
		loginpage.addequipment.click();
		
//test space value validation	
		

		
		try {
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("     ");
			Thread.sleep(2000);
			String validmsg =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
		    Thread.sleep(2000);
			System.out.println("getvalue" + validmsg);
			boolean testvalidation =validmsg.contains("Equipment Name allow only letters & Number");
			
			if(testvalidation) {
				validmsg ="Equipment Name allow only letters & Number";
   }
				TestCasePrint("test-space-value", "Equipment Name allow only letters & Number", String.valueOf(validmsg));
			
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).clear();
		}
		catch(AssertionError e) {
			TestCasePrint("test-space-value", "Equipment Name allow only letters & Number", String.valueOf(e));
			
		}
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();
	}

@Test(priority=3)
public static void MinimumCharacterValidation() throws InterruptedException {
	loginpage.addequipment.click();
	
//test space value validation	
	

	
	try {
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("qw");
		Thread.sleep(2000);
		String validmsg =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
	    Thread.sleep(2000);
		System.out.println("getvalue" + validmsg);
		boolean testvalidation =validmsg.contains("At least 3 characters long!");
		
		if(testvalidation) {
			validmsg ="At least 3 characters long!";
}
			TestCasePrint("MinimumCharacterValidation", "At least 3 characters long!", String.valueOf(validmsg));
		
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).clear();
	}
	catch(AssertionError e) {
		TestCasePrint("MinimumCharacterValidation", "At least 3 characters long!", String.valueOf(e));
		
	}
	
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();
}


@Test(priority=4)
public static void emptyvalid() throws InterruptedException {
	loginpage.addequipment.click();
	
//test space value validation	
	

	
	try {
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("qw");
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		String validmsg =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
	    Thread.sleep(2000);
		System.out.println("getvalue" + validmsg);
		boolean testvalidation =validmsg.contains("Name can't be empty");
		
		if(testvalidation) {
			validmsg ="Name can't be empty";
}
			TestCasePrint("emptyvalidation", "Name can't be empty", String.valueOf(validmsg));
		
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).clear();
	}
	catch(AssertionError e) {
		TestCasePrint("emptyvalidation", "Name can't be empty", String.valueOf(e));
		
	}
	
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();
}


@Test(priority=5)
public static void InvalidSymbol() throws InterruptedException {
	loginpage.addequipment.click();
	
//test space value validation	
	

	
	try {
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("!!!");
		Thread.sleep(2000);
		String validmsg =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
	    Thread.sleep(2000);
		System.out.println("getvalue" + validmsg);
		boolean testvalidation =validmsg.contains("Equipment Name allow only letters & Number");
		
		if(testvalidation) {
			validmsg ="Equipment Name allow only letters & Number";
}
			TestCasePrint("invalid-symbol", "Equipment Name allow only letters & Number", String.valueOf(validmsg));
		
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).clear();
	}
	catch(AssertionError e) {
		TestCasePrint("invalid-symbol", "Equipment Name allow only letters & Number", String.valueOf(e));
		
	}
	
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();
}

@Test(priority=6)
public static void Invalidnumbers() throws InterruptedException {
	loginpage.addequipment.click();
	
//test space value validation	
	

	
	try {
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("123");
		Thread.sleep(2000);
		String validmsg =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
	    Thread.sleep(2000);
		System.out.println("getvalue" + validmsg);
		boolean testvalidation =validmsg.contains("Invalid Characters");
		
		if(testvalidation) {
			validmsg ="Invalid Characters";
}
			TestCasePrint("invalid-numbers", "Invalid Characters", String.valueOf(validmsg));
		
		driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).clear();
	}
	catch(AssertionError e) {
		TestCasePrint("invalid-numbers", "Invalid Characters & Number", String.valueOf(e));
		
	}
	
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();
}
}


