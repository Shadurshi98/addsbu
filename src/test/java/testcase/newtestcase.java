package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

/**
*
* Description: This test case checks if the application allows the user to add a unit successfully
* 
* Date: 2023-02-20
* Modified date - 2023-02-20
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
	
	
	/*STEP-01 CHECKING UI OF ADDSBU BUTTON(enable,visible,background-color,padding,font-family,color,font-size,text-spelling,
	*border-color,border-radius,font-weight,cursor,opacity,box-shadow)
	*/
	properties.uiOfAddSbu();
	
	//STEP-02 CLICK ADDSBU BUTTON
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")).click();
	
	//STEP-03 CHECKING THE UI OF THE POPUP , AFTER CLICKING THE ADDSBU BUTTON(Visibility,position,size,Background-color,border-color,overflow,margin,cursor,z-index,header,content,onclick-inside,onclick- outside)
	properties.uiOfSbuModal();
	
	//STEP-04 CHECKING THE UI OF TEXTBOX OF SBU(PlaceHolder,Visibility,Enablity,Postion,Background-color,Border-color,Length,Width,Border Color,Font style,Font Size,Font-color)
	properties.uioftextboxsbu();
	
	//STEP-05 CHECKING THE VALIDATION OF TEXTBOX OF SBU
	properties.validationoftextboxsbu();
	
	//STEP-06 CHECKING THE UI OF TEXTDESCRIPTION(PlaceHolder,Visibility,Enablity,Postion,Background-color,Border-color,Length,Width,Border Color,Font style,Font Size,Font-color)
	properties. uioftextdescription();
}

}

