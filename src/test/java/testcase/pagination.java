package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.initial;
import pages.loginpage;

public class pagination extends initial {

	loginpage loginpages = new loginpage();
	propertiesofpagination properties = new propertiesofpagination();
@Test
	public void first() throws InterruptedException {
		PageFactory.initElements(driver, loginpages);

		loginpage.username.sendKeys("admin");
		loginpage.password.sendKeys("tokyo@admin");
		loginpage.loginbutton.click();
		Thread.sleep(4000);
		loginpage.master.click();
		loginpage.equipment.click();
		Thread.sleep(2000);
		// STEP-01-CLICKING MATERIALSUBCATERGORY BUTTON
		loginpage.materialsubcatergory.click();
		
		//STEP-01 Checking Default Index Page
		propertiesofpagination.DefaultIndexPage();
		
		//STEP-02 Checking Default Index Page after Refresh
		propertiesofpagination.RefreshDefaultPage();
		
		//STEP-03 Checking Page Redriect to the next page
		propertiesofpagination.PageRedrict();
		
		//STEP-04 Checking Previous Button Dispaly
		propertiesofpagination.PreButtonDispaly();
		
		//STEP-05 Checking Next Button Dispaly
		propertiesofpagination.NextButtonDispaly();
		
		
		//STEP-06 Checking Next Button Enable
		propertiesofpagination.NextButtonEanble();
		
	    //STEP-07 Checking Before navigate to 2 Page Previous Button is Disabled
         propertiesofpagination.SecPagepreButDisable();
         
         
         //STEP-08 Checking After Navigate to the Seconfd Page Previous button Enabled
         propertiesofpagination. AfterMovetoSecPagepreButEnable();
	}
}
