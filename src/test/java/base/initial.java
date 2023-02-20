package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment;

public class initial {
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest testCase;

	public static WebDriver driver;
@BeforeSuite
	public void main() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login");
		
		//driver.get("https://ant.design/components/transfer");
		//driver.get("http://192.168.1.35:8083/#/login");
		extentreport();
}

public static void extentreport() throws IOException{
	extent = new ExtentReports();
	htmlreporter = new ExtentHtmlReporter("C:\\Users\\sgic\\eclipse-workspace\\sadz\\report\\report.html");
	extent.attachReporter(htmlreporter);
	
	
}

@AfterSuite
public void close() {
	extent.flush();
}

}
