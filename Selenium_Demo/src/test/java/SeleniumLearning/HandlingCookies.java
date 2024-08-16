package SeleniumLearning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class HandlingCookies {
	@Test
	public void ReadCookies()
	{
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
		dr.navigate().to("https://google.com");
		//Set cookies=	dr.manage().getCookies();
		
		for(org.openqa.selenium.Cookie ck : dr.manage().getCookies()) 
		{ 
			System.out.println((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.isSecure())); 
			System.out.println("<br>"); 
		}
	
	}

	@Test
	public void LearnDesiredCapabilities()
	{
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browser", "chrome");
		
	}
}
