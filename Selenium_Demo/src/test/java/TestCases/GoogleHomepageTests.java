package TestCases;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.GoogleHomePage;
import Common.clsCommon;

public class GoogleHomepageTests {

	WebDriver dr;
	GoogleHomePage _gpage = null;
	clsCommon _common = new clsCommon();

	public GoogleHomepageTests() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		// dr.navigate().to("https://www.google.com");
		_common.NavigatetoSite(dr, "https://www.google.com");
		_gpage = new GoogleHomePage(dr);

	}

	public void DiasplayName() {
		System.out.println("My name is Anand");
	}

	@Test(priority = 1)
	public void SearchCountry() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.navigate().to("https://www.google.com");
		_gpage = new GoogleHomePage(dr);

		_gpage.txtSrch.sendKeys("India");
		_gpage.txtSrch.sendKeys(Keys.ENTER);
		dr.manage().window().maximize();
		// dr.findElement(By.name("q")).sendKeys("India");
		// dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		// _gpage.txtSrc.sendKeys(Keys.ENTER);
		// _gpage.SearchKeyword();
		Thread.sleep(3000);
		// WebElement linkCapital=dr.findElement(By.xpath("//a[text()='New Delhi']"));
		Assert.assertEquals(_gpage.linkCapital.isDisplayed(), true);
	}

	@Test(priority = 1)
	public void OpenImages() throws InterruptedException {
		//_gpage.linkImages.click();
		_common.CLickonElement(_gpage.linkImages);
	}

	@Test(priority = 1)
	public void OpenGmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.navigate().to("https://www.google.com");
		_gpage = new GoogleHomePage(dr);

		_gpage.linkGmail.click();
		// _gpage.txtSrch.sendKeys("India");
	}

	// Get the URL, title
	@Test(priority = 2)
	public void LearnGettingTitleURL() {
		dr.navigate().to("https://www.google.com");
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
	}
	@Test
	public void LearnScrollup()
	{
		_common.NavigatetoSite(dr, "https://amazon.in");
		_common.ScrollDown(-5000, dr);
	}
	@Test
	public void SearvcChaina()
	{
		_common.NavigatetoSite(dr, "https://google.com");
		//_common.EnterText(dr, "q", "Chaina");
	     _gpage.txtSrch1.sendKeys("Israel");
	}

}
