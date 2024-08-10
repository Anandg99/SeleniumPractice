package Common;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clsCommon {
	
public void ScrollUp(int pixel,WebDriver dr)
{
	JavascriptExecutor js = (JavascriptExecutor) dr;
	js.executeScript("scrollBy(0," + pixel + ")");
}
public void ScrollDown(int pixel,WebDriver dr)
{
	JavascriptExecutor js = (JavascriptExecutor) dr;
	js.executeScript("scrollBy(0," + -pixel + ")");
}

public void CLickonElement(WebElement element)
{
	element.click();
}
public void CLickonElementById(String strId,WebDriver dr)
{
	dr.findElement(By.id(strId)).click();
}
public void CLickonElementByXpath(String strXpath,WebDriver dr)
{
	dr.findElement(By.xpath(strXpath)).click();
}
public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
	// Convert web driver object to TakeScreenshot
	TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
	// Call getScreenshotAs method to create image file
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	// Move image file to new destination
	File DestFile = new File(fileWithPath);
	// Copy file at destination
	FileUtils.copyFile(SrcFile, DestFile);

}


}
