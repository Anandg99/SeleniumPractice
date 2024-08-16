package SeleniumLearning;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import Common.clsCommon;

public class WaitsInSelenium {
	
	WebDriver dr;
	clsCommon objCommon = new clsCommon();

	public WaitsInSelenium() // constructor
	{
	}
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.navigate().to("https://google.com");
			
	}
	
	@Test
	public void LearnImplicitWait()
	{
		
	}
	@Test
	public void LearnExplicitWait()
	{
		WebDriverWait wait = new WebDriverWait(dr, 10);
		WebElement dynamicElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Gmail")));
		dynamicElement.click();
	}
	
	@Test
	public void LearnFluentWait()
	{
		/*
		Wait wait = new FluentWait(dr)
			    .withTimeout(Duration.ofSeconds(30))
			    .pollingEvery(Duration.ofSeconds(5)
			    .ignoring(NoSuchElementException.class);

			WebElement dynamicElement = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
			dynamicElement.click();
			*/
	}
	@AfterMethod
	public void cleanup()
	{
		dr.close();
	}

}
