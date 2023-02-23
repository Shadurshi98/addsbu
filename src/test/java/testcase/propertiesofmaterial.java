package testcase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class propertiesofmaterial extends initial {
	//loginpage loginpages = new loginpage();

	boolean expectselect;

	public void first() {
	//	PageFactory.initElements(driver, loginpages);
	}

	public void checkbox() throws InterruptedException {
		boolean value = loginpage.materialsubcatergorycheckbox.isSelected();
		System.out.println("actual:" + value);
		Thread.sleep(2000);
		loginpage.materialsubcatergorycheckbox.click();
		Thread.sleep(4000);
		expectselect = loginpage.materialsubcatergorycheckbox.isSelected();
		System.out.println("actual:" + value);
		System.out.println("Expected:" + expectselect);
		// testCase = extent.createTest("functionality");
		testCase = extent.createTest("STEP-01-CLICKING MATERIALSUBCATERGORY BUTTON");
		testCase = extent.createTest("STEP-02-CLICKING RELEAVANT TEST");
		testCase = extent.createTest("STEP-03-CHECKING THE FUNCTIONALITY OF CHECKBOX");

		if (value) {
			if (!expectselect) {
				TestCasePrint("1. FUNCTIONALITY ", "false", String.valueOf(expectselect));
			} else {
				TestCasePrint("1. FUNCTIONALITY ", "false", String.valueOf(expectselect));
			}
		} else if (!value) {
			if (expectselect) {
				TestCasePrint("1. FUNCTIONALITY -of checkbox", "true", String.valueOf(expectselect));
			} else {
				TestCasePrint("1. FUNCTIONALITY -of checkbox", "true", String.valueOf(expectselect));
			}
		}

	}

	public void checking() throws InterruptedException {
		testCase = extent.createTest("STEP-06-CHECKING WHETHER THE CHANGES HAVE SAVED");
		loginpage.relevanttest.click();
		Thread.sleep(2000);
		boolean current = loginpage.materialsubcatergorycheckbox.isSelected();
		if (current == expectselect) {
			TestCasePrint("1. saved sucessfully", String.valueOf(expectselect), String.valueOf(current));
		} else {
			TestCasePrint("1.saved sucessfully", String.valueOf(expectselect), String.valueOf(current));

		}
	}

	public void uiofcancel() {

		testCase = extent.createTest("STEP-07-CHECKING THE UI OF CANCEL BUTTON");
		boolean Value1 = loginpage. materialsubcatergorycancel.isDisplayed();

		if (Value1) {

			try {
				boolean Value = loginpage. materialsubcatergorycancel.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = loginpage. materialsubcatergorycancel.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(217, 217, 217)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(217, 217, 217)", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorycancel.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Cancel", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Cancel", String.valueOf(e));
			}
			try {
				Dimension Value = loginpage. materialsubcatergorycancel.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(75, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(75, 32)", String.valueOf(e));
			}

			try {
				Point Value = loginpage. materialsubcatergorycancel.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(858, 638)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(858, 638)", String.valueOf(e));
			}
			testCase = extent.createTest("STEP-08-CLICKING THE CANCEL BUTTON");

		} else {
			TestCasePrint("Element displayed", "true", String.valueOf(Value1));
		}

	}

	public void uiofsave() {

		testCase = extent.createTest("STEP-04-CHECKING THE UI OF SAVE BUTTON");
		boolean Value1 = loginpage. materialsubcatergorysavebutton.isDisplayed();

		if (Value1) {

			try {
				boolean Value = loginpage. materialsubcatergorysavebutton.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = loginpage. materialsubcatergorysavebutton.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = loginpage. materialsubcatergorysavebutton.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Save", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Save", String.valueOf(e));
			}
			try {
				Dimension Value = loginpage. materialsubcatergorysavebutton.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(60, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(60, 32)", String.valueOf(e));
			}

			try {
				Point Value = loginpage. materialsubcatergorysavebutton.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(941, 677)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(941, 677)", String.valueOf(e));
			}
			testCase = extent.createTest("STEP-05-CLICKING THE SAVE BUTTON");
		} else {
			TestCasePrint("Element displayed", "true", String.valueOf(Value1));
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
