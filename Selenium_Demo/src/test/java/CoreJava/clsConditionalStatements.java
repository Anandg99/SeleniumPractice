package CoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clsConditionalStatements {
	@Test
	public void LearnIfStatement() 
	{
         int x=10;
         int y=20;
         if(x<18)
         {
        	 System.out.println("Student is minor");
         }
	}
	@Test
	public void VerifyStudAge()
	{
		int age=22;
		if(age<18)
		{
		 System.out.println("student is minor");
		}
	}

	@Test
	public void LearnIfElseStmt() {
		int age = 25;
		if (age < 18) 
		{
			System.out.println("Student is minor");
		} 
		else if (age > 18 && age < 25) 
		{
			System.out.println("Student is major");
		}

		else 
		{
			System.out.println("Student is Old");
		}
	}
	@Test
	public void LearnSwitchCase()
	{
		int age=40;
		switch(age)
		{
		case 20:
			System.out.println("Student age is 20");
			break;
		
		case 30:
			System.out.println("Student age is 30");
			break;
		
		default:
			System.out.println("Student age is unknown");
			break;
			
		}
	}
}
