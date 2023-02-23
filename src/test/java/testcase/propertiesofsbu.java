package testcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class propertiesofsbu extends initial {
	loginpage loginpages = new loginpage();
	///// properties of addsbu button

	public void first() {
		PageFactory.initElements(driver, loginpages);
	}

	public void uiOfAddSbu() {
		testCase = extent.createTest("STEP-01-CHECKING UIOFADDSBU BUTTON");
		boolean Value1 = loginpage.addsbu.isDisplayed();

		if (Value1) {

			try {
				boolean Value = loginpage.addsbu.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = loginpage.addsbu.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage.addsbu.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = loginpage.addsbu
						.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Add SBU", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Add SBU", String.valueOf(e));
			}
			try {
				Dimension Value = loginpage.addsbu
						.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(180, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(180, 32)", String.valueOf(e));
			}
			
			try {
				Point Value = loginpage.addsbu
						.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(588, 93)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(588, 93)", String.valueOf(e));
			}
			
			
		} else {
			TestCasePrint("Element not displayed", "true", String.valueOf(Value1));
		}

	}

	public void clickabilityofaddsbubutton() {
		testCase = extent.createTest("STEP-02-CHECKING THE CLICKABILITY AND CLICKING THE ADDSBU BUTTON");

//		driver.findElement(By.xpath(
//				"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).click();
		boolean clickable = false;
		try {

			String originalURL = driver.getCurrentUrl();
			String originalPageSource = driver.getPageSource();
			Thread.sleep(2000);
			WebElement element = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"));
			Thread.sleep(2000);
			element.click();
			System.out.println("Element is clicked");

			String updatedURL = driver.getCurrentUrl();
			String updatedPageSource = driver.getPageSource();

			if (!originalURL.equals(updatedURL) || !originalPageSource.equals(updatedPageSource)) {
				System.out.println("Changes have happened on the page");
				clickable = true;
			} else {
				System.out.println("No changes have happened on the page");
			}
		} catch (Exception e) {
			clickable = false;
		}
		System.out.println("clickability :- " + clickable);

		TestCasePrint("CLICKABILITY", "true", String.valueOf(clickable));

	}

///////// properties of addsbu modal
	public void uiOfSbuModal() {

		testCase = extent.createTest("STEP-03-CHECKING THE UI OF THE POPUP , AFTER CLICKING THE ADDSBU BUTTON");

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

		testCase = extent.createTest("STEP-04-CHECKING THE UI OF TEXTBOX OF SBU(");
		try

		{
			String Value = driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).getAttribute("placeholder");
			TestCasePrint("placeholder-name", "Enter Sub business unit ", Value);
		} catch (Exception e) {
			TestCasePrint("placeholder-name", "Enter Sub business unit ", String.valueOf(e));
		}
	}

	public void validationoftextboxsbu() throws IOException, InterruptedException {
		// testCase = extent.createTest("STEP-05 CHECKING THE VALIDATION OF TEXTBOX OF
		// SBU");
		FileInputStream file = new FileInputStream("C:\\Users\\sgic\\eclipse-workspace\\sadz\\report\\validation.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("validationsheet");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {

			XSSFRow row = sheet.getRow(i);
			String sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();
			String validation = (String) row.getCell(2).getStringCellValue();
			String message = (String) row.getCell(3).getStringCellValue();
			Thread.sleep(1000);
		}
	}

	public void addingtextdata() {
		testCase = extent.createTest("STEP-05-PASSING A DATA TO THE TEXTBOX");
		driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys("testunit");
	}

	public void uioftextdescription() {
		testCase = extent.createTest("STEP-06- CHECKING THE UI OF TEXTDESCRIPTION");

		try

		{
			String Value = driver.findElement(By.xpath("//*[@id=\"description\"]")).getAttribute("placeholder");
			System.out.println(Value);
			TestCasePrint("placeholder-name", "Enter Description ", Value);
		} catch (Exception e) {
			TestCasePrint("placeholder-name", "Enter Description", String.valueOf(e));
		}

	}

	public void addingdescriptiondata() {
		testCase = extent.createTest("STEP-07-PASSING DATA TO THE DESCRIPTION BOX");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("product");
	}

	public void uiofsave() {
		testCase = extent.createTest("STEP-08-CHECKING THE UI OF SAVE BUTTON");
		boolean Value1 = loginpage.savebutton.isDisplayed();

		if (Value1) {

			try {
				boolean Value = loginpage.savebutton.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = loginpage.savebutton.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage.savebutton.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = loginpage.savebutton
						.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Save", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Save", String.valueOf(e));
			}
			
			try {
				Dimension Value = loginpage.savebutton
						.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(60, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(60, 32)", String.valueOf(e));
			}
			
			try {
				Point Value = loginpage.savebutton
						.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(907, 288)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(907, 288)", String.valueOf(e));
			}
			
			
		} else {
			TestCasePrint("Element not displayed", "true", String.valueOf(Value1));
		}

	}

	public void clickabilityofsavebutton() {
		testCase = extent.createTest("STEP-09-CLICKING THE SAVE BUTTON");
		boolean clickable = false;
		try {

			String originalURL = driver.getCurrentUrl();
			String originalPageSource = driver.getPageSource();

			Thread.sleep(2000);
			loginpage.savebutton.click();
			System.out.println("Element is clicked");

			String updatedURL = driver.getCurrentUrl();
			String updatedPageSource = driver.getPageSource();

			if (!originalURL.equals(updatedURL) || !originalPageSource.equals(updatedPageSource)) {
				System.out.println("Changes have happened on the page");
				clickable = true;
			} else {
				System.out.println("No changes have happened on the page");
			}
		} catch (Exception e) {
			clickable = false;
		}
		System.out.println("clickability :- " + clickable);

		TestCasePrint("CLICKABILITY", "true", String.valueOf(clickable));

	}

	public void elementadd() {
		testCase = extent.createTest("STEP-10-CHECKING THE WHETHER THE ELEMENT ADDED SUCESSFULLY");
		String Value = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]"))
				.getText();
		System.out.println(Value);
		TestCasePrint("element added", "testunit", Value);

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