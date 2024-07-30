package SeleniumLearning;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Dictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

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

public class HandlingFrames {
	WebDriver dr;

	public HandlingFrames() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}

	@Test
    public void VerifyHandlingMultipleWindows()
    {
        dr.navigate().to("https://demo.guru99.com/test/guru99home/");
        WebElement elementFrame = dr.findElement(By.xpath("//iframe[@name='a077aa5e']"));
        dr.switchTo().frame(elementFrame);
        WebElement imgJmeter = dr.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
        imgJmeter.click();

        Set<String> listHandles = dr.getWindowHandles();
        for (String windowHandle : listHandles) {
            // Switch to the desired window
            dr.switchTo().window(windowHandle);
            // Perform actions on the window
            System.out.println("Title of the window: " + dr.getTitle());
         }
    }
}

