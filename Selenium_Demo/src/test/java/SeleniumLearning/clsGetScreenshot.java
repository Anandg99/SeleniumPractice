package SeleniumLearning;

import org.testng.annotations.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clsGetScreenshot {
	@Test
	public void testBStackTakeScreenShot() throws Exception {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.browserstack.com");
		this.takeSnapShot(dr, "C:\\Anand_Details\\Screenshots\\screenshot1.jpg");
	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

	}
}