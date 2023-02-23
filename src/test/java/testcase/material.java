package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;
/**
*
* Description: This test case checks the relevant test functionality
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
public class material extends initial {
	loginpage loginpages = new loginpage();
	propertiesofmaterial properties = new propertiesofmaterial();

	@Test
	public void first() throws InterruptedException {
		PageFactory.initElements(driver, loginpages);

		
		
		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(2000);
		loginpage.master.click();
		loginpage.equipment.click();
		Thread.sleep(2000);
		//STEP-01-CLICKING MATERIALSUBCATERGORY BUTTON
		loginpage.materialsubcatergory.click();
		Thread.sleep(3000);
		
		//STEP-02-CLICKING RELEAVANT TEST
		loginpage.relevanttest.click();
		Thread.sleep(2000);
		properties.first();
		
		//STEP-03-CHECKING THE FUNCTIONALITY OF CHECKBOX
		properties.checkbox();
		
		//STEP-04-CHECKING THE UI OF SAVE BUTTON
		properties.uiofsave();
		
		//STEP-05-CLICKING THE SAVE BUTTON
		loginpage.materialsubcatergorysavebutton.click();
		Thread.sleep(5000);
		
		//STEP-06-CHECKING WHETHER THE CHANGES HAVE SAVED
		properties.checking();
		
		//STEP-07-CHECKING THE UI OF CANCEL BUTTON
		properties.uiofcancel();
		
		//STEP-08-CLICKING THE CANCEL BUTTON
		loginpage.materialsubcatergorycancel.click();

//		Thread.sleep(3000);
//		String value =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td/div")).getText();
//		System.out.println(value);
//		 if (value=="No Data") {
//			boolean value1= loginpage.materialsubcatergorysavebutton.isEnabled();
//			TestCasePrint("no data present button enability","true",String.valueOf(value1));
//			 
//		 }
//		 
//		 else {
//			 
//			 boolean value1= loginpage.materialsubcatergorysavebutton.isEnabled();
//				TestCasePrint("no data present button enability","false",String.valueOf(value1));
//		 }
	}



}
