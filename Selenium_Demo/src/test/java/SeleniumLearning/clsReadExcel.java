package SeleniumLearning;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Utilities.clsUtils;

public class clsReadExcel {

	clsUtils _utils=new clsUtils();

	@Test
	public void SearchCountry() throws IOException
	{
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.navigate().to("https://google.com");
	
	    String keyword=	_utils.GetCellValue("C:\\Anand_Details\\Anvesh.xlsx",0,0);
		WebElement txtSrch=dr.findElement(By.name("q"));
		txtSrch.sendKeys(keyword);
	}

}
