package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

// A test case to check the addsbu and modal


public class newtestcase extends initial {
loginpage loginpages =new loginpage();
propertiesofsbu properties =new propertiesofsbu();

@Test
public  void addSbu () throws InterruptedException ,IOException{
	PageFactory.initElements(driver, loginpages);
	
	loginpage.username.sendKeys("admin");
	loginpage.password.sendKeys("tokyo@admin");
	loginpage.loginbutton.click();
	Thread.sleep(5000);
	loginpage.master.click();
	loginpage.sbubutton.click();
	
	
	//checking the ui of add sbu button
	properties.uiOfAddSbu();
	//click add sbu button
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).click();
	//checking the ui of sbumodal
	properties.uiOfSbuModal();
	//checking the ui of textbox of sbu
	properties.uioftextboxsbu();
	//checking the ui of textdescription of sbu
	properties. uioftextdescription();
}

}

