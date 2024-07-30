package CoreJava;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.result.Row;

import CoreJava.Person;

public class clsSeleniumBasics {

	WebDriver dr;

	public clsSeleniumBasics() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}

	public void DiasplayName() {
		System.out.println("My name is Anand");
	}

	@Test
	public void SearchCountry() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.google.com");
		dr.findElement(By.name("q")).sendKeys("India");
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement linkCapital = dr.findElement(By.xpath("//a[text()='New Delhi']"));
		Assert.assertEquals(linkCapital.isDisplayed(), true);
	}

	// Get the URL, title
	@Test
	public void LearnGettingTitleURL() {
		dr.navigate().to("https://www.google.com");
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
	}

	@Test
	public void LearnHashmap() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("India", "Delhi");
		hm.put("USA", "Washinton");
		hm.put("UK", "London");
		hm.put("USA", "Newyork");
		hm.put(null, "Newjersy");

		// loop through hashmap elements
		for (Map.Entry<String, String> entry : hm.entrySet()) {

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println(hm.size());
		System.out.println(hm.containsKey("chaina"));
		System.out.println(hm.containsValue("Chicago"));

	}

	@Test
	public void LearnArraylist() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Benz");

		System.out.println("Size is:" + cars.size()); // size:3
		System.out.println("contains bmw:" + cars.contains("BMW")); // expected : true
		System.out.println("contains Dezire:" + cars.contains("Dezire")); // expected : False

		System.out.println("Index of Audi:" + cars.indexOf("Audi")); // Index : 1

	}

	@Test
	public void LearnIfStmt() {
		int age = 15;
		if (age < 18) {
			System.out.println("Student is minor");
		} else if (age > 18 && age < 25) {
			System.out.println("Student is major");
		}

		else {
			System.out.println("Student is Old");
		}
	}

	@Test
	public void LearnInheritance() {
		clsChild objChild = new clsChild();
		objChild.DisplayName();
		objChild.DisplayName("Asha"); // overloaded method
	}

	@Test
	public void VerifySdetails() {
		clsStud objStud = new clsStud();
		String sname = objStud.GetStudBySno(500);
		System.out.println("Student name is:" + sname);
	}
	@Test
	public void LearnDataDriven()
	{
		try
		{
		FileInputStream fis=new FileInputStream(new File("C:\\Anvesh.xlsx"));  
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet s1= wb.getSheet("Sheet1");
		org.apache.poi.ss.usermodel.Row r1=s1.getRow(1);
		Cell c1=r1.getCell(0);
		System.out.println(c1.toString());
		}
		
		catch(Exception ex)
		{
		 System.out.println("Exception reading excel");	
		}
	}
	@Test
	public void LearnEncapuslation()
	{
		Person p1=new Person();
		
		p1.setName("Anand");
		System.out.println("Name is: " + p1.getName());
	}
	@Test
	public void reverseString()
	{
		String name="Krutanjali"; //10
		char arrChars[]=name.toCharArray();
		String strRev="";
		for(int i=arrChars.length-1;i>=0;i--)
		{
			strRev=strRev+ arrChars[i];
		}
		System.out.println(strRev);
	}
}