package SeleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HandlingMultipleWindows {

	@Test
	public void VerifyHandlingMultipleWindows() {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();

		dr.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement elementFrame = dr.findElement(By.xpath("//iframe[@name='a077aa5e']"));
		dr.switchTo().frame(elementFrame);
		WebElement imgJmeter = dr
				.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		imgJmeter.click();
		String parent = dr.getWindowHandle(); // parent window
		Set<String> listHandles = dr.getWindowHandles();

		// dr.switchTo().Window(listHandles.); //switch to 2nd tab
		Iterator<String> I1 = listHandles.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				dr.switchTo().window(child_window);

				System.out.println(dr.switchTo().window(child_window).getTitle());
				dr.findElement(By.name("email")).sendKeys("anandg99@yahoo.com");
				
				dr.switchTo().window(parent);
				System.out.println("after switch to parent:" + dr.getTitle());
				

			}

		}
	}
}
