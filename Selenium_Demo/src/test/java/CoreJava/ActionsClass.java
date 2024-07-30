package CoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Common.clsCommon;
public class ActionsClass {
	WebDriver dr;
	clsCommon objCommon=new clsCommon();
	public ActionsClass() // constructor
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}

	// Actions class: MovetoElement
	@Test
	public void MoveToElement() {
		Actions action = new Actions(dr);
		dr.navigate().to("https://www.google.com");
		WebElement txtSrch = dr.findElement(By.name("q"));
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
		action.moveToElement(txtSrch).sendKeys("India").build().perform();
	}

	// Actions class: Double Click on element
	@Test
	public void LearnDoubleClick() {
		Actions action = new Actions(dr);
		dr.navigate().to("https://www.google.com");
		WebElement linkGmail = dr.findElement(By.linkText("Gmail"));
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
		action.moveToElement(linkGmail).doubleClick().build().perform();
	}

	// Actions class: MovetoElement, Rightclick
	@Test
	public void LearnActionsClass() {
		Actions action = new Actions(dr);
		dr.navigate().to("https://www.google.com");
		WebElement txtSrch = dr.findElement(By.name("q"));
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
		action.moveToElement(txtSrch).contextClick().build().perform();
	}

	@Test
	public void LearnJavascriptExecutor() throws InterruptedException {
		Actions action = new Actions(dr);
		dr.navigate().to("https://www.amazon.com");
		
		objCommon.ScrollUp(5000, dr);
		Thread.sleep(2000);
		objCommon.ScrollDown(1000, dr);
		
	}
}
