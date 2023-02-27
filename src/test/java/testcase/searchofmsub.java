package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.initial;
import pages.loginpage;

public class searchofmsub extends initial{
	loginpage loginpages = new loginpage();
	propertiesofsearchmsub properties = new propertiesofsearchmsub();
	
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
	properties.trys();
	properties.uiofplaceholder();
	properties.uiofsearch();
	
	
	
	
	}
}
