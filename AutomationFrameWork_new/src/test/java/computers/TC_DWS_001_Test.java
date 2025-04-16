package computers;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricutility.BaseClass;
import genricutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass {
	@Test
	public void clickOnComputers() {
		hp=new HomePage(driver);
		hp.getCoputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","Computers page is not displayed");
		test.log(Status.PASS, "Computers page is displayed");
		
	}
	
	
	

}
