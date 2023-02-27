package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class propertiesofsearchmsub extends initial {
	


	public void uiofplaceholder() {
		testCase = extent.createTest("uiofplaceholder");
		boolean Value1 = loginpage.placeholder.isDisplayed();
		if (Value1) {
			try {
				boolean Value = loginpage.placeholder.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1.visibility ", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1.visibility ", "true", String.valueOf(e));
			}

			try {
				String Value = loginpage.placeholder.getText();
				// Thread.sleep(2000);
				TestCasePrint("2.text spelling ", "Material Sub Category", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.text spelling", "Material Sub Category", String.valueOf(e));
			}
		}

		try {
			String Value = loginpage.placeholder.getCssValue("font-family");
			// Thread.sleep(2000);
			System.out.println(Value);
			TestCasePrint("3.font-family  ", "Roboto, sans-serif", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("3.font-family", "Roboto, sans-serif", String.valueOf(e));
		}
		try {
			String Value = loginpage.placeholder.getCssValue("font-size");
			// Thread.sleep(2000);
			System.out.println(Value);
			TestCasePrint("4.font-size ", "13px", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("4.font-size", "13px", String.valueOf(e));
		}
		try {
			String Value = loginpage.placeholder.getCssValue("color");
			// Thread.sleep(2000);
			System.out.println(Value);
			TestCasePrint("5.color ", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("5.color", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
		}

		try {
			Dimension Value = loginpage.placeholder.getSize();
			// Thread.sleep(2000);
			System.out.println(Value);
			TestCasePrint("6.position ", "(229, 37)", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("6.position", "(229, 37)", String.valueOf(e));
		}
	}
	
	
	
	public void uiofsearch() {
		boolean Value1 = loginpage.searchmsub.isDisplayed();
		boolean Value2 = loginpage.searchmsub.isEnabled();
		
		if( Value1&& Value2 ) {
			try {
				testCase = extent.createTest("uiofsearch");
				boolean Value = loginpage.placeholder.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1.visibility ", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1.visibility ", "true", String.valueOf(e));
			}
			
			try {
				boolean Value = loginpage.placeholder.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2.enability ", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.enability ", "true", String.valueOf(e));
			}
			
			try {
				String Value = loginpage.placeholder.getCssValue("fill");
				// Thread.sleep(2000);
				TestCasePrint("3.fill color ", "rgb(0, 0, 0)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.fill color", "rgb(0, 0, 0)", String.valueOf(e));
			}
			try {
				String Value = loginpage.placeholder.getCssValue("cursor");
				// Thread.sleep(2000);
				TestCasePrint("4.cursor ", "auto", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.cursor ", "auto", String.valueOf(e));
			}
			
			try {
				Dimension Value = loginpage.placeholder.getSize();
				// Thread.sleep(2000);
				TestCasePrint("5.size ", "(229, 37)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.size ", "(229, 37)", String.valueOf(e));
			}
			try {
				Point Value = loginpage.placeholder.getLocation();
				// Thread.sleep(2000);
				TestCasePrint("5.position ", "(173, 133)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.position ", "(173, 133)", String.valueOf(e));
			}
			
			loginpage.searchmsub.click();
			if (loginpage.searchtext.isDisplayed()&&loginpage.searchtext.isEnabled()) {
			loginpage.searchtext.sendKeys("SBTA");
			 
			uiofsearchbutton();
			
			
			
			}
			
			else if((loginpage.searchtext.isDisplayed()==true)&& (loginpage.searchtext.isEnabled()==false)) {
				TestCasePrint("1.visibility ", "true", String.valueOf(Value1));
				TestCasePrint("2.enability", "true", String.valueOf(Value2));
			}
			else if((loginpage.searchtext.isDisplayed()==false)&& (loginpage.searchtext.isEnabled()==false)) {
				TestCasePrint("1.visibility ", "true", String.valueOf(Value1));
				
			}
			
		}
		else if(Value1 == false) {
			TestCasePrint("1.visibility ", "true", String.valueOf(Value1));
		}
		else if(Value1==true && Value2 == false) {
			TestCasePrint("1.visibility ", "true", String.valueOf(Value1));
			TestCasePrint("2.enability", "true", String.valueOf(Value2));
		}
	}

	
	public void uiofsearchbutton() {
		boolean Value = loginpage.placeholder.isDisplayed();
		boolean value1 = loginpage.placeholder.isEnabled();
		if(Value&&value1 ) {
			
			//uiofsearchbotton
			//check if popup disappears and searched data appears
			
			
		}
		else if(Value==true && value1==false) {
			TestCasePrint("1.visibility ", "true", String.valueOf(Value));
			TestCasePrint("2.enability", "true", String.valueOf(value1));
		}
		else if(Value==false){
			TestCasePrint("1.visibility ", "true", String.valueOf(Value));
		}
	}
	
	public void trys() {
		WebElement table = driver.findElement(By.xpath("//div [@class=\"ant-table-container\"]"));

		// Specify the name to search for
		String nameToSearch = "SBTA";

		// Find the pagination element
		WebElement pagination = driver.findElement(By.xpath("//ul[@class='ant-pagination mini ant-table-pagination ant-table-pagination-right']"));

		// Initialize a counter for the number of rows that contain the specific name
		int count = 0;

		// Loop through all pages in the table
		while (true) {
		    // Find all the rows in the current page
		    List<WebElement> rows = table.findElements(By.tagName("tr"));

		    // Loop through all the rows in the current page
		    for (WebElement row : rows) {
		        // Find the first cell in the current row
		        WebElement firstCell = row.findElement(By.xpath("//td[1]"));
		        
                System.out.println(firstCell.getText());
		        // Check if the first cell contains the specific name
		        if (firstCell.getText().contains(nameToSearch)) {
		            // Increment the counter if the name is found in the first cell
		            count++;
		        }
		    }

		    // Check if there is a next page
		    try {
		        WebElement nextPageLink = pagination.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"));
		        // Click the next page link
		        nextPageLink.click();
		    } catch (NoSuchElementException e) {
		        // If there is no next page, exit the loop
		        break;
		    }
		}System.out.println(count);
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
