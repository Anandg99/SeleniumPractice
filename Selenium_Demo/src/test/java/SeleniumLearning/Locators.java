package SeleniumLearning;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.Assert;
import org.testng.annotations.*;
public class Locators 
{

	@Test
	public void SearchCountry()
	{
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
		dr.navigate().to("https://google.com");
		
		dr.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("India");
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		WebElement linkCapital=	dr.findElement(By.linkText("New Delhi"));
		Assert.isTrue(linkCapital.isDisplayed()==true, "Newdelhi is not displayed");
		
		linkCapital.click();
		
		WebElement capIndia=dr.findElement(By.xpath("//span[text()='Capital of India']"));
		Assert.isTrue(capIndia.isDisplayed()==true, "Capital of India is not displayed");
		capIndia.click();
		
	}
	@Test
	public void OpenGamil()
	{

		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();

		dr.navigate().to("https://google.com");
		WebElement linkGmail= dr.findElement(By.linkText("Gmail"));
		linkGmail.click();
		
		String currentUrl=dr.getCurrentUrl();
		Assert.isTrue(currentUrl.contains("https://www.google.com/intl/en-US/gmail/about/")==true,"Gmail NOT opened");
	
		String currentTitle=dr.getTitle();
		Assert.isTrue(currentTitle.contains("Private and secure123")==true,"Gmail page is not opened");
	}
	@Test
	public void GoogleSearch()
	{

		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();

		dr.navigate().to("https://google.com");
	   // dr.findElement(By.name("q")).sendKeys("India");
	    dr.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		
	}

}
