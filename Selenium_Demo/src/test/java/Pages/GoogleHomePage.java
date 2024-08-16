package Pages;

import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	public WebDriver dr;
	public WebElement linkGmail;
	public WebElement txtSrch;
	public WebElement linkImages;

	public GoogleHomePage(WebDriver driver) {
		this.dr = driver;
		// System.out.println("Called constructor");
		PageFactory.initElements(driver, this);
		txtSrch = dr.findElement(By.name("q"));
		linkGmail = dr.findElement(By.linkText("Gmail"));
		linkImages=dr.findElement(By.linkText("Images"));
	}

	@FindBy(how = How.NAME, using = "q")
	public WebElement txtSrch1;

	@FindBy(how = How.XPATH, using = "//a[text()='New Delhi']")
	public WebElement linkCapital;
	
	@FindBy(how=How.NAME,using="btnK")
	public WebElement btnGoogleSearch;
	

	public void SearchKeyword() {
		dr.findElement(By.name("q")).sendKeys("India");
		// txtSrch.sendKeys("India");
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
