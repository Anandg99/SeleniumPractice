package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

}
