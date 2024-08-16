package SeleniumLearning;

import org.testng.annotations.*;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Common.clsCommon;

public class clsGetScreenshot {
	
	clsCommon _common=new clsCommon();
	
	@Test
	public void testBStackTakeScreenShot() throws Exception {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
		try
		{
		  dr.get("https://www.browserstack.com");
		  int x=20;
		  int y=0;
		  int z=x/y; //devide by 0
		}
		
		catch(Exception ex)
		{
			LocalDate localDate = LocalDate.now();
			System.out.println(localDate);
			
	    	clsCommon.takeSnapShot(dr, "C:\\Anand_Details\\Screenshots\\testBStackTakeScreenShot_"+ localDate +".jpg");
	    	dr.close();
		}
	}

		@Test
	public void PrintTime()
	{
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
	}
}