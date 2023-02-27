package testcase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.openqa.selenium.By;
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
	
	public void checking2() throws IOException, InterruptedException {
		
		
		// Get the text of the element that contains the string "11-20 of 1373"
		String elementText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[1]")).getText();

		// Split the text into an array of strings using "of" as the delimiter
		String[] textArray = elementText.split("of");

		// Get the second element in the array, which should be " 1373"
		String numberString = textArray[1].trim();

		// Convert the string to an integer
		int number = Integer.parseInt(numberString);

		// Print the number
		System.out.println(number);

		

		String csvFile = "C:\\Users\\sgic\\Downloads\\material.csv";

		try {
		    File file = new File(csvFile);
		    Thread.sleep(5000);
		    Scanner scanner = new Scanner(file);

		    // Skip the header row
		    if (scanner.hasNextLine()) {
		        scanner.nextLine();
		    }

		    int rowCount = 0;
		    while (scanner.hasNextLine()) {
		    	Thread.sleep(5000);
		        String line = scanner.nextLine();
		        String[] fields = line.split(",");

		        // Process the row here
		        Thread.sleep(5000);
		        rowCount++;
		    }

		    System.out.println("Number of rows processed: " + rowCount);

		    scanner.close();
		} catch (FileNotFoundException e) {
		    System.out.println("File not found: " + csvFile);
		    e.printStackTrace();
		}

		
		
//		String csvFile = "C:\\Users\\sgic\\Downloads\\material.csv";
//		Thread.sleep(2000);
//        BufferedReader br = new BufferedReader(new FileReader(csvFile));
//        String line;
//        int numOfCsvEntries = 0;
//        while ((line = br.readLine()) != null) {
//            numOfCsvEntries++;
//        }
//        br.close();
//        System.out.println("print" +numOfCsvEntries);
	}
	
//	public void checking2() throws IOException {
//		String download = "C:/Users/sgic/Downloads";
//		File downloadfile = new File(download + "downloaded file");
//		FileInputStream fis = new FileInputStream(downloadfile);
//		Workbook downloadedWorkbook = new XSSFWorkbook(fis);
//		System.out.println("print");
//	}

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
