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
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement savebutton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")
	public static WebElement addsbu;
	
	@FindBy(xpath="//a[@href='#/master/materiallevel']")
	public static WebElement equipment;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public static WebElement materialsubcatergory;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[3]/td[5]/span/a/span")
	public static WebElement relevanttest;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement materialsubcatergorysavebutton;
	
	@FindBy(xpath="//*[@id=\"status\"]")
	public static WebElement materialsubcatergorycheckbox;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[5]")
	public static WebElement materialsub;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div[5]/button")
	public static WebElement export;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[1]")
	public static WebElement materialsubcatergorycancel;
	
	@FindBy(xpath="//ul[@class='ant-pagination mini ant-table-pagination ant-table-pagination-right']")
	public static WebElement pagination;
}

