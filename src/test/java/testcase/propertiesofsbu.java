package testcase;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import base.initial;

public class propertiesofsbu extends initial {

	///// properties of addsbu button
	public void uiOfAddSbu() {
		try {
			boolean Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.isDisplayed();
			Thread.sleep(2000);
			TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
		}

		try {
			boolean Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.isEnabled();
			Thread.sleep(2000);
			TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
		}

		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("background-color");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("3. UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("3.UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("padding");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("font-family");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("color");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("6. UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("6.UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("font-size");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("border-radius");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("border-color");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("9. UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("9.UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("box-shadow");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("font-weight");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("cursor");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getCssValue("opacity");
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
		}
		try {
			String Value = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
					.getText();
			System.out.println(Value);
			Thread.sleep(2000);
			TestCasePrint("14. UI -opacity", "Add SBU", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("14.UI -opacity", "Add SBU", String.valueOf(e));
		}
		TestCasePrint("ui of addsbu", "", "");
	}

///////// properties of addsbu modal
	public void uiOfSbuModal() {

		try {
			boolean Value = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).isDisplayed();
			Thread.sleep(2000);
			TestCasePrint("15. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("15. FUNCTIONALITY - visibility", "true", String.valueOf(e));
		}
		try {
			boolean Value = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).isEnabled();
			Thread.sleep(2000);
			TestCasePrint("16. FUNCTIONALITY - enability", "true", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("16. FUNCTIONALITY - enability", "true", String.valueOf(e));
		}
	}

public void uioftextboxsbu() {
	try

	{
		String Value = driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).getAttribute("placeholder");
		TestCasePrint("placeholder-name", "Enter Sub business unit ", Value);
	}catch(
	Exception e)
	{
		TestCasePrint("placeholder-name", "Enter Sub business unit ", String.valueOf(e));
	}
}
public void uioftextdescription() {
	
	try

	{
		String Value = driver.findElement(By.xpath("//*[@id=\"description\"]")).getAttribute("placeholder");
		System.out.println(Value);
		TestCasePrint("placeholder-name", "Enter Description " , Value);
	}catch(
	Exception e)
	{
		TestCasePrint("placeholder-name", "Enter Description", String.valueOf(e));
	}
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
}