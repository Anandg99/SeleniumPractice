package SeleniumLearning;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Selectbox 
{
	@Test

	public void VerifyTop1Company() throws InterruptedException
    {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
		dr.navigate().to("https://www.moneycontrol.com/stocks/marketinfo/marketcap/bse/index.html");
        Thread.sleep(45000);
        List<WebElement> listCompanies=  dr.findElements(By.xpath("//table[@class='Topfilter_web_tbl_indices__Wa1Sj undefined']/tbody/tr"));
        System.out.println(listCompanies.size());
        WebElement topComp = dr.findElement(By.xpath("//table[@class='Topfilter_web_tbl_indices__Wa1Sj undefined']/tbody/tr[1]/td[1]"));
        System.out.println("Top company name:" + topComp.getText());

    }
	@Test
	public void InteractingWithSelectBox()
	{
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
		  dr.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		  WebElement ddCountry = dr.findElement(By.name("country"));
		  Select objSelect = new Select(ddCountry);
		 
		  objSelect.selectByIndex(2); //American samoa
		  objSelect.selectByVisibleText("INDIA");
		  objSelect.selectByValue("CHINA");
		  
		  //Console.WriteLine("Multiple values allowed:" + objSelect.IsMultiple);

		  int optCount = objSelect.getOptions().size();
		  System.out.println("options count is:" + optCount);

		  //objSelect.DeselectByValue("CHINA");
		  for (int i = 0; i < optCount; i++)
		  {
		      objSelect.selectByIndex(i);
		  }
	}
}