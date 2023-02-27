package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
/**
*
* Description: This test case checks the export functionality
* 
* Date: 2023-02-22
* Modified date - 2023-02-23
* Author - shadurshi
* Testcase number -
* precondition
* 
* 
* Test Steps:
* 1.
* 
*
* 
* Expected Results:
* - 
* - 
*/
import org.testng.annotations.Test;

import base.initial;
import pages.loginpage;

public class export extends initial {
	loginpage loginpages = new loginpage();
	propertiesofexport properties = new propertiesofexport();

	@Test
	public void first() throws InterruptedException ,IOException{
		PageFactory.initElements(driver, loginpages);

		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(5000);
		loginpage.master.click();
		loginpage.equipment.click();
		loginpage.materialsub.click();
		
		//STEP-01-CHECKING THE UI OF EXPORT BUTTON
		properties. uiofexportbutton();
		Thread.sleep(5000);
		
		//STEP-02-CLICKING THE EXPORT BUTTON
		loginpage.export.click();

		//STEP-03-CHECKING WHETHER THE DOCUMENT IS DOWNLOADED
		properties.checking();
		
		
	//	properties.checking2();
			}
}
