package books;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.TextReporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genricutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_001_Test extends BaseClass {
	@Test
	public void clickBooks() {
		
		ExtentTest test=extReport.createTest("clickBooks");
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		//WebDriver driver=new ChromeDriver();
		//RemoteWebDriver driver2=new ChromeDriver();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop.B","Bookspage is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}

}
