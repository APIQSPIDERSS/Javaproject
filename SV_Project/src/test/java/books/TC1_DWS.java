package books;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC1_DWS {
	@Test
	public void bookspage() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("lunch books page",true);
		
	}

}
