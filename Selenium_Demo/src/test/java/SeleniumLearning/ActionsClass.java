package SeleniumLearning;

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
	clsCommon objCommon = new clsCommon();

	public ActionsClass() // constructor
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}

	// Actions class: MovetoElement
	@Test
	public void MoveToElement() 
	{
		try
		{
		Actions action = new Actions(dr); // parameterized constructor
		dr.navigate().to("https://www.google.com");
		WebElement txtSrch = dr.findElement(By.name("q"));
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
		action.moveToElement(txtSrch).sendKeys("India").build().perform();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	@Test
	public void LearnMouseOver() 
	{
		Actions action = new Actions(dr); // parameterized constructor
		dr.navigate().to("https://www.techtutorialz.com");
		WebElement linkTutorials = dr.findElement(By.xpath("//a[@title='Tutorials']"));
		dr.manage().window().maximize();
		action.moveToElement(linkTutorials).build().perform();
	}

	// Actions class: Double Click on element
	@Test
	public void LearnDoubleClick() 
	{
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
	public void LearnActionsClass() 
	{
		Actions action = new Actions(dr);
		dr.navigate().to("https://www.google.com");
		WebElement txtSrch = dr.findElement(By.name("q"));
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
		action.moveToElement(txtSrch).contextClick().build().perform();
	}

	@Test
	public void VerifyPrivacyNote() 
	{
		dr.navigate().to("http://amazon.in");
		WebElement linkPrivacy = dr.findElement(By.xpath("//a[text()='Privacy Notice']"));
		Actions action = new Actions(dr);
		action.moveToElement(linkPrivacy).build().perform();
		linkPrivacy.click();
	}

	@Test
	public void DragAndDropElement() 
	{
		dr.navigate().to("http://demo.guru99.com/test/drag_drop.html");

		// Element which needs to drag.
		WebElement From = dr.findElement(By.xpath("//*[@id='credit2']/a"));

		// Element on which need to drop.
		WebElement To = dr.findElement(By.xpath("//*[@id='bank']/li"));

		// Using Action class for drag and drop.
		Actions action = new Actions(dr);

		// Dragged and dropped.
		action.dragAndDrop(From, To).build().perform();
	
	}

	@Test
	public void DragAndDropElementSales() 
	{
		dr.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		dr.manage().window().maximize();

		// Element which needs to drag.
		WebElement From = dr.findElement(By.xpath("//a[normalize-space(text())='SALES']"));

		// Element on which need to drop.
		WebElement To = dr.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

		// Using Action class for drag and drop.
		Actions action = new Actions(dr);

		// Dragged and dropped.
		action.dragAndDrop(From, To).build().perform();
		// Thread.sleep(2000);
	}

	@Test
	public void KeyDownonElement() throws InterruptedException 
	{
		dr.navigate().to("https://www.Techtutorialz.com/");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		Actions action = new Actions(dr);
		WebElement element = dr.findElement(By.xpath("//a[text()='View Tutorial Library']"));
		// element.click();
		action.sendKeys(element, Keys.ENTER).build().perform();
	}

	@Test
	public void LearnJavascriptExecutor() throws InterruptedException 
	{
		Actions action = new Actions(dr);
		dr.navigate().to("https://www.amazon.com");
		objCommon.ScrollUp(5000, dr);
		Thread.sleep(2000);
		objCommon.ScrollDown(1000, dr);
	}
	@Test
	public void TestCase3()
	{
		System.out.println("Testcase3");
	}
	}

