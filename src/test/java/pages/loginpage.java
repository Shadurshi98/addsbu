package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
	public static WebElement loginbutton;
	
	@FindBy(id="usernameOrEmail")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(className="flex-card-home") 
	public static WebElement master;
	
	@FindBy(id="addPlant")
	public static WebElement material;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div/div[1]")
	public static WebElement dropdown;
	
	@FindBy(className="login-form-forgot")
	public static WebElement forget;
	
	@FindBy(className="h1_login")
	public static WebElement logintitle;
	
	@FindBy(xpath="//*[@id=\"active\"]")
	public static WebElement checkbox;     
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div/div[2]/a/div/div") 
	public static WebElement testconfiguration;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[3]/div[1]")
	public static WebElement testconfigure;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/header/ul/li[2]")
	public static WebElement equipments; 
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button")
	public static WebElement addequipment;
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/header/ul/div/div[1]/a/span/span/svg")
	public static WebElement icon;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]")
	public static WebElement sbubutton;
}

