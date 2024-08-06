package SeleniumLearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.*;
public class InteractingWithElements {
	public WebDriver dr;
	public InteractingWithElements()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		
	}
@Test
public void InteractWithCheckBoxAndRadio()
{
	WebDriver dr;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
	dr = new ChromeDriver();
	
	
	
	  dr.navigate().to("https://www.ironspider.ca/forms/checkradio.htm");
	  WebElement chkRed = dr.findElement(By.xpath("//input[@value='red']"));
	  //Console.WriteLine("blue color is selected:" + chkRed.Selected);
	  
	  if (chkRed.isSelected() == false)
	  {
	      chkRed.click(); //select
	  }
	  Assert.isTrue(chkRed.isSelected()==true,"Red check box is NOT selected");
	  
	  WebElement radioOpera = dr.findElement(By.xpath("(//input[@type='radio'])[3]"));
	  System.out.println("Before selected: Opera is selected1:" + radioOpera.isSelected());
	 
	  if (radioOpera.getAttribute("selected") == null)
	  {
	      radioOpera.click();
	  }
	  //System.out.println("After click: Opera is selected1:" + radioOpera.isSelected());
	  System.out.println("After click: Opera is selected1:" + radioOpera.getAttribute("selected"));
}
@Test
public void InteractingWithSelectBox()
{
	WebDriver dr;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
	dr = new ChromeDriver();
	
	  dr.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	  WebElement ddCountry = dr.findElement(By.name("country"));
	  Select objSelect = new Select(ddCountry);
	 
	  objSelect.selectByIndex(2); //American samoa
	  objSelect.selectByVisibleText("INDIA");
	  objSelect.selectByValue("CHINA");
	  
	  System.out.println("Multiple values allowed:" + objSelect.isMultiple());

	  int optCount = objSelect.getOptions().size();
	  System.out.println("options count is:" + optCount);

	  //objSelect.DeselectByValue("CHINA");
	  for (int i = 0; i < optCount; i++)
	  {
	      objSelect.selectByIndex(i);
	  }
}

@Test
public void LearnListbox()
{
	 dr.navigate().to("https://output.jsbin.com/osebed/2");
	 WebElement fruitsLB = dr.findElement(By.xpath("//select[@id='fruits']"));
	 Select objSelect = new Select(fruitsLB);
	 System.out.println("Multi select allowed:" + objSelect.isMultiple());
	 objSelect.selectByValue("apple");
	 objSelect.selectByVisibleText("Grape");
	 objSelect.selectByIndex(2);
	 System.out.println("Selected options count before:" + objSelect.getAllSelectedOptions().size()); //3
	 objSelect.deselectByValue("apple");
	 //objSelect.DeselectAll();
	 System.out.println("Selected options count after deselecting apple:" + objSelect.getAllSelectedOptions().size()); //2
	
}

}
