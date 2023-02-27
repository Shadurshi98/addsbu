package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class propertiesofmaterial extends initial {
	// loginpage loginpages = new loginpage();

	boolean expectselect;
	WebElement checkingpath;
	WebElement checkingpath1;

//****************************************************************************************************************
//                    CHECKS THE PARTICULAR TEXT IN EACH AND EVERY ROW IN THE TABLE
//
//****************************************************************************************************************
	public void checkpagination() throws InterruptedException {
		testCase = extent.createTest("STEP-01-CLICKING MATERIALSUBCATERGORY BUTTON");
		testCase = extent.createTest("STEP-02-SEARCH FOR THE NAME IN THE ROW"); 
		testCase = extent.createTest("STEP-03-CHECKING THE EXISTANCE OF RELEVANT TEST ICON");
		
		String Name = "SBTA";
		String NameXpath_firstPart = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[";
		String NameXpath_lastPart = "]/td[1]";
		String EditXpath_firstPart = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[";
		String EditXpath_lastPart = "]/td[5]/span/a/span";

		boolean clickNextPage = true;
		boolean sbuExist = false;
		while (clickNextPage) {
			for (int i = 2; i < 103; i++) {
				try {
					String text = driver.findElement(By.xpath(NameXpath_firstPart + i + NameXpath_lastPart)).getText();
					System.out.println(text);
					if (text.equals(Name)) {
						sbuExist = true;
						// Thread.sleep(2000);
						checkingpath = driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart));
						testCase = extent.createTest("STEP-04-CLICK RELEAVANT TEST");
						if (checkingpath.isDisplayed() && checkingpath.isEnabled()) {
							TestCasePrint("1.Functionality -visibility ", "true",
									String.valueOf(checkingpath.isDisplayed()));
							TestCasePrint("2.Functionality -enability ", "true",
									String.valueOf(checkingpath.isEnabled()));
							checkingpath.click();
							
						} else if (checkingpath.isDisplayed() == true && checkingpath.isEnabled() == false) {
							TestCasePrint("Functionality -visibility ", "true",
									String.valueOf(checkingpath.isDisplayed()));
							TestCasePrint("Functionality -enability ", "true",
									String.valueOf(checkingpath.isEnabled()));
						} else if (checkingpath.isDisplayed() == false) {
							TestCasePrint("Functionality -visibility ", "true",
									String.valueOf(checkingpath.isDisplayed()));

						}
						// checkingpath.click();
						Thread.sleep(2000);
						clickNextPage = false;

						break;
					}
				} catch (Exception e) {
				}
			}
			if (clickNextPage == true) {
				clickNextPage = driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"))
						.isEnabled();
				driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']")).click();
				Thread.sleep(2000);
			} else {
				break;
			}
		}
		Thread.sleep(2000);
		if (sbuExist == false) {
			System.out.println("No such Element" + sbuExist);
		}

	}
//		loginpage.search.click();
//		Thread.sleep(2000);
//		loginpage.searchtext.sendKeys("SBTA");
//		loginpage.search.click();
//
//		Thread.sleep(5000);
//		WebElement table = driver.findElement(By.xpath("//div [@class=\"ant-table-container\"]"));
//		Thread.sleep(5000);
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		int rowCount = rows.size(); 
//		int rowCount1 = rows.size() - 1;
//		System.out.println("Row count: " + rowCount);
//		System.out.println("Row count: " + rowCount1);
//		String search = "SBTA";
//		
//		for (int i = 2; i <= rowCount1; i++) {
//			String text = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]")).getText();
//			System.out.println("print" + text);
//			System.out.println("-----------------------------");
//			if (search.equals(text)) {
//				boolean display = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]")).isDisplayed();
//				boolean enable = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]")).isEnabled();
//				
//				if (display && enable) {
//
//					driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]")).click(); 
//					// break;
//					// table after clicking the filter button
//
//					WebElement table1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table"));
//					Thread.sleep(5000);
//					List<WebElement> rows1 = table1.findElements(By.tagName("tr")); 
//					List<WebElement> cols1 = table1.findElements(By.tagName("td"));
//					System.out.println("colum :"+ cols1);
//					int rowCount0 = rows1.size();
//					int rowCount11 = rows1.size() - 1;
//					System.out.println("Row count new table: " + rowCount0); 
//					System.out.println("Row count new table: " + rowCount11);
//					String search1 = "Slip_inactive3";
//					
//					for (int j = 2; j <= rowCount11; j++) {
//						String text1 = driver.findElement(By.xpath("//tbody/tr[" + j + "]/td[1]")).getText();
//						System.out.println("print new" + text1);
//						break;
//					} 
//					
//				} else if (display == true && enable == false) { 
//					TestCasePrint("Functionality -visibility ", "true", "display");
//					
//				} else if (display == false) {
//					TestCasePrint("Functionality -visibility ", "true", "display");
//				}
//
//				// System.out.println("print");
//				break;
//			}
//			// else {
//			// System.out.println("no searched item");
//			// }
//		//	else{TestCasePrint("The searched item is not found ", "", "");}
//		
//		}
//
//	}

//****************************************************************************************************************
//	                    CHECKS THE FUNCTIONALITY OF THE CHECKBOX
//
//****************************************************************************************************************
	public void checkbox() throws InterruptedException {
		testCase = extent.createTest("STEP-05-CHECKING THE FUNCTIONALITY OF CHECKBOX");
		boolean value = loginpage.materialsubcatergorycheckbox.isSelected();
		System.out.println("actual:" + value);
		Thread.sleep(2000);
		loginpage.materialsubcatergorycheckbox.click();
		Thread.sleep(4000);
		expectselect = loginpage.materialsubcatergorycheckbox.isSelected();
		System.out.println("actual:" + value);
		System.out.println("Expected:" + expectselect);
		// testCase = extent.createTest("functionality");
		
		//testCase = extent.createTest("STEP-02-CLICKING RELEAVANT TEST");
		//testCase = extent.createTest("STEP-03-CHECKING THE FUNCTIONALITY OF CHECKBOX");

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

//****************************************************************************************************************
//		                    CHECKS THE WHETHER THE CHANGES HAVE BEEN SAVED
//
//****************************************************************************************************************	
	public void checking() throws InterruptedException {
		testCase = extent.createTest("STEP-08-CHECKING WHETHER THE CHANGES HAVE SAVED");
		checkingpath.click();
		Thread.sleep(3000);
		boolean current = loginpage.materialsubcatergorycheckbox.isSelected();
		if (current == expectselect) {
			TestCasePrint("1. saved sucessfully", String.valueOf(expectselect), String.valueOf(current));
		} else {
			TestCasePrint("1.saved sucessfully", String.valueOf(expectselect), String.valueOf(current));

		}
	}

//****************************************************************************************************************
//                UI OF THE CANCEL BUTTON
//
//****************************************************************************************************************	
	public void uiofcancel() {

		testCase = extent.createTest("STEP-09-CHECKING THE UI OF CANCEL BUTTON");
		
		boolean Value1 = loginpage.materialsubcatergorycancel.isDisplayed();

		if (Value1) {

			try {
				boolean Value = loginpage.materialsubcatergorycancel.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = loginpage.materialsubcatergorycancel.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(217, 217, 217)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(217, 217, 217)", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorycancel.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Cancel", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Cancel", String.valueOf(e));
			}
			try {
				Dimension Value = loginpage.materialsubcatergorycancel.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(75, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(75, 32)", String.valueOf(e));
			}

			try {
				Point Value = loginpage.materialsubcatergorycancel.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(858, 638)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(858, 638)", String.valueOf(e));
			}
			testCase = extent.createTest("STEP-10-CLICKING THE CANCEL BUTTON");

		} else {
			TestCasePrint("Element displayed", "true", String.valueOf(Value1));
		}

	}
//****************************************************************************************************************
//                    UI OF THE SAVE BUTTON
//
//****************************************************************************************************************		

	public void uiofsave() {

		testCase = extent.createTest("STEP-06-CHECKING THE UI OF SAVE BUTTON");
		
		boolean Value1 = loginpage.materialsubcatergorysavebutton.isDisplayed();

		if (Value1) {

			try {
				boolean Value = loginpage.materialsubcatergorysavebutton.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = loginpage.materialsubcatergorysavebutton.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = loginpage.materialsubcatergorysavebutton.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Save", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Save", String.valueOf(e));
			}
			try {
				Dimension Value = loginpage.materialsubcatergorysavebutton.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(60, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(60, 32)", String.valueOf(e));
			}

			try {
				Point Value = loginpage.materialsubcatergorysavebutton.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(941, 677)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(941, 677)", String.valueOf(e));
			}
			testCase = extent.createTest("STEP-07-CLICKING THE SAVE BUTTON");
		} else {
			TestCasePrint("Element displayed", "true", String.valueOf(Value1));
		}

	}

//	public void checkingthemodalrow() {
//
//		String Name = "Slip_inactive3";
//		String NameXpath_firstPart = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[";
//		String NameXpath_lastPart = "]/td[1]";
//		String EditXpath_firstPart = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[";
//		String EditXpath_lastPart = "]/td[3]";
//
//		boolean sbuExist = false;
//		// while (clickNextPage) {
//		for (int i = 2; i < 103; i++) {
//			try {
//				Thread.sleep(2000);
//				String text = driver.findElement(By.xpath(NameXpath_firstPart + i + NameXpath_lastPart)).getText();
//				System.out.println(text);
//				if (text.equals(Name)) {
//					sbuExist = true;
//					checkingpath1 = driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart));
//					if (checkingpath1.isDisplayed() && checkingpath1.isEnabled()) {
//						checkbox();
//					//	checkingpath1.click();
//					} else if (checkingpath1.isDisplayed() == true && checkingpath1.isEnabled() == false) {
//						TestCasePrint("Functionality -visibility ", "true", String.valueOf(checkingpath1.isDisplayed()));
//						TestCasePrint("Functionality -enability ", "true", String.valueOf(checkingpath1.isEnabled()));
//					} else if (checkingpath1.isDisplayed() == false) {
//						TestCasePrint("Functionality -visibility ", "true", String.valueOf(checkingpath1.isDisplayed()));
//						break;
//					}
//				}
//			} catch (Exception e) {
//			}
//
//		}
//		if (sbuExist == false) {
//			System.out.println("no element exists");
//		}
//
//	}

//****************************************************************************************************************
//                 GENERATES THE REPORT
//
//****************************************************************************************************************		
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

//*[@id="root"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]
//html/body/div[4]/div/div[2]/div/div[2]/div[2]
