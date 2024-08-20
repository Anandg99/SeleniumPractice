/*
package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

public class clsGetAttribute {
	@Test
	public void SearchCountry()
	{
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
		dr.navigate().to("https://google.com");
		
		WebElement txtSrch=	dr.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		txtSrch.sendKeys("India");
		//txtSrch.sendKeys(Keys.ENTER);
		
		String maxLength=txtSrch.getAttribute("maxlength");
		System.out.println("maxlength is:" + maxLength);
		
		System.out.print(txtSrch.getAttribute("name"));
		
		System.out.print("Value of text box is:" + txtSrch.getAttribute("value"));
	}
}
*/