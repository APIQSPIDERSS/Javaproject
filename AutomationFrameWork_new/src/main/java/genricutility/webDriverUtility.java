package genricutility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class webDriverUtility {
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	public void mouseover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
     public void doublieClick(WebDriver driver,WebElement element) {
    	 Actions act=new Actions(driver);
    	 act.doubleClick().perform();
     }
     public void clickAndHold(WebDriver driver,WebElement element) {
    	 Actions act=new Actions(driver);
    	 act.clickAndHold().perform();
     }
      
     public void selectByIndex(WebElement element,int index) {
    	 Select sel=new Select(element);
    	 sel.selectByIndex(index);   	 
}
     public void selectByValue(WebElement element,String value) {
    	 Select sel=new Select(element);
    	 sel.selectByValue(value);
     }
     public void selectByVisibleText(WebElement element,String text) {
    	 Select sel=new Select(element);
    	 sel.selectByContainsVisibleText(text);
     }
     public void switchToFrame(WebDriver driver,int index) {
    	 driver.switchTo().frame(index);
     }
     public void switchToFrame(WebDriver driver,String nameOrId) {
    	 driver.switchTo().frame(nameOrId);
     }
     public void switchToFrame(WebDriver driver,WebElement frameElement) {
    	 driver.switchTo().frame(frameElement);
     }
     public void switchToAlert(WebDriver driver) {
    	 driver.switchTo().alert();
     }
     public void switchToAlertAndAccept(WebDriver driver) {
    	 driver.switchTo().alert().accept();
     }
     public void SwitchToAlertAndDismiss(WebDriver driver) {
    	 driver.switchTo().alert().dismiss();
     }
     public void getPhoto(WebDriver driver) throws IOException {
    	 JavaUtility jutil=new JavaUtility();
		 TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+jutil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
		
    	 
    	 
     }
}

