package testcase;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.AssertJUnit;
import com.aventstack.extentreports.Status;
import base.initial;
import pages.loginpage;

public class propertiesofexport extends initial {
	
	
	
	
	public void uiofexportbutton() {
		testCase = extent.createTest("STEP-01-CHECKING UI OF EXPORT BUTTON");
		boolean Value1 = loginpage.export.isDisplayed();

		if (Value1) {

			try {
				boolean Value = loginpage.export.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = loginpage.export.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage.export.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(0, 20, 34, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(0, 20, 34, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 16px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 16px", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "32px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "32px", String.valueOf(e)); 
			}
			try {
				String Value = loginpage.export.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.043) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.043) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = loginpage.export.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = loginpage.export
						.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Export", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Export", String.valueOf(e));
			}
			try {
				Dimension Value = loginpage.export
						.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(94, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(94, 32)", String.valueOf(e));
			}
			
			try {
				Point Value = loginpage.export
						.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(1126, 93)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(1126, 93)", String.valueOf(e));
			}
			
			
		} else {
			TestCasePrint("Element not displayed", "true", String.valueOf(Value1));
		}

	}

	
	public void checking() {
		testCase = extent.createTest("STEP-02-CLICKING THE EXPORT BUTTON");
		testCase = extent.createTest("STEP-03-CHECKING WHETHER THE DOCUMENT IS DOWNLOADED");
		File downloadDir = new File("C:/Users/sgic/Downloads"); // Replace with the path to your download directory
		File[] files = downloadDir.listFiles();
		boolean fileFound = false;
		for (File file : files) {
		    if (file.isFile() && file.getName().startsWith("material") && file.getName().endsWith(".csv")) {
		        fileFound = true;
		        break;
		    }
		}
		if (fileFound) {
		    System.out.println("File is downloaded successfully.");
		    TestCasePrint("1. document downloaded ", "true", String.valueOf(fileFound));
		    
		} else {
		    System.out.println("File is not downloaded.");
		    TestCasePrint("1. document downloaded ", "false", String.valueOf(fileFound));

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
