package SeleniumLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
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

public class HandlingWebtables {
	WebDriver dr;
	clsCommon objCommon = new clsCommon();

	public HandlingWebtables() // constructor
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}

	@Test

	public void VerifyRows() throws InterruptedException
    {
        dr.navigate().to("https://www.moneycontrol.com/stocks/marketinfo/marketcap/bse/index.html");
        Thread.sleep(10000);
        List<WebElement> listCompanies=  dr.findElements(By.xpath("//table[@class='Topfilter_web_tbl_indices__Wa1Sj undefined']/tbody/tr"));
        System.out.println(listCompanies.size());
        WebElement topComp = dr.findElement(By.xpath("//table[@class='Topfilter_web_tbl_indices__Wa1Sj undefined']/tbody/tr[1]/td[1]"));
        System.out.println("Top company name:" + topComp.getText());

    }
	
	@Test

	public void Get2ndCompanyDetails() throws InterruptedException
    {
		//System.out.println("started executing Get2ndCompanyDetails at" + DateTime.Now.ToString());
        dr.navigate().to("https://www.moneycontrol.com/stocks/marketinfo/marketcap/bse/index.html");
        Thread.sleep(20000);
        WebElement secondCompany = dr.findElement(By.xpath("//table[@class='Topfilter_web_tbl_indices__Wa1Sj undefined']/tbody/tr[2]/td[1]"));
        System.out.println("2nd company name is:" + secondCompany.getText());
        WebElement secondCompanyPrice = dr.findElement(By.xpath("//table[@class='Topfilter_web_tbl_indices__Wa1Sj undefined']/tbody/tr[2]/td[2]"));
        System.out.println("2nd company price is:" + secondCompanyPrice.getText());
        //System.out.println("Ended executing Get2ndCompanyDetails at" + DateTime.Now.ToString());

    }
	
	@Test
	public void GetHighestCompany() {
		String cname = GetCompanyNameByRank(3);
		System.out.println(cname);
		dr.close();

	}

	public String GetCompanyNameByRank(int rankNum)
    {
        dr.navigate().to("https://www.moneycontrol.com/stocks/marketinfo/marketcap/bse/index.html");
        WebElement elemTopComp = dr.findElement(By.xpath("//table/tbody/tr[" + rankNum + "]/td[1]/a"));
        String cname = elemTopComp.getText();
        // Console.WriteLine("Top company name is:" + cname);
        return cname;
    }
	@Test

	public void GetRankByCompanyName() throws InterruptedException {
		int rank = GetRankByCompany("SBI");
		System.out.println("SBI Rank is:" + rank);

	}

	public int GetRankByCompany(String company) throws InterruptedException {
		WebElement ElementbyRank;
		String raname = "";
		int index = 0;
		dr.navigate().to("https://www.moneycontrol.com/stocks/marketinfo/marketcap/bse/index.html");
		dr.manage().window().maximize();
		Thread.sleep(30000);
		List<WebElement> rowList = dr.findElements(By.xpath("//table/tbody/tr"));

		for (int i = 1; i <= rowList.size(); i++) {
			ElementbyRank = dr.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]/a"));
			raname = ElementbyRank.getText();
			if (company.contains(raname)) {
				index = i;
				break;
			}
		}

		return index;
	}

}

