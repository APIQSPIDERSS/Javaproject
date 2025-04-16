package genricutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.WelcomePage;
import objectrepository.loginPage;

public class BaseClass {
	public static ExtentReports extReport;
	public static WebDriver driver;
	public static ExtentTest test;
	
	public JavaUtility jutil=new JavaUtility();
	public webDriverUtility wutil=new webDriverUtility();
	public FileUtility futil=new FileUtility();
	
	public HomePage hp;
	public loginPage lp;
	public WelcomePage wp;
	
	@BeforeSuite
	public void reportConfiguration()  {
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report_"+jutil.getSystemTime()+".html");
	extReport=new ExtentReports();
	extReport.attachReporter(spark);
	

}
	
	@BeforeClass
	public void openBrowser() throws IOException {
		
		driver=new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(futil.getDataFromProperty("url"));
	}
	@BeforeMethod
	public void login() throws IOException {
		wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		lp=new loginPage(driver);
		lp.getEmailTextField().sendKeys(futil.getDataFromProperty("email"));
		lp.getPasswordTextFiled().sendKeys(futil.getDataFromProperty("password"));
		lp.getLoginButton().click();
		
	
			
		}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
		hp.getLogoutLink().click();
		
		
		
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@AfterSuite
	public void reportBackup() {
		extReport.flush();
	}
}