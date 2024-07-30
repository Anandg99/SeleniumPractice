package SeleniumLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingAlerts {
	WebDriver dr;

	public HandlingAlerts() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}

	@Test
	public void AcceptAlert() {
		// Alert Message handling
		dr.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.name("cusid")).sendKeys("523190");
		dr.findElement(By.name("submit")).click();
		// Switching to Alert
		Alert alert = dr.switchTo().alert(); // switch to 1st popup
		System.out.print("1st alert text:" + alert.getText());
		alert.accept(); // click on OK button

		Alert alert2 = dr.switchTo().alert(); // switch to 2nd popup
		System.out.print("1st alert text:" + alert2.getText());
		alert2.accept(); // click on OK button

	}

	@Test
	public void HandlingAlertsBasedonCondition() {
		dr.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.name("cusid")).sendKeys("523190");
		dr.findElement(By.name("submit")).click();
		// Switching to Alert
		Alert alert = dr.switchTo().alert(); // switch to 1st popup
		System.out.print("1st alert text:" + alert.getText());
		String altText1=alert.getText();
		
		if (altText1.contains("Do you really want to delete this Customer?")) 
		{
			// Accepting alert
			alert.accept();
		}
		Alert alertDelete = dr.switchTo().alert();
		String actualMsg = alertDelete.getText();
		Assert.assertEquals("Customer Successfully Delete!", actualMsg, "Customer is not deleted");
		alertDelete.accept(); // Click on OK button
	}
}
