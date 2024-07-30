package CoreJava;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
//import java.util.Set;
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
public class clsCollections 
{
	@Test
	public void LearnHashmap()
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("India", "Delhi");
		hm.put("USA","Washinton");
		hm.put("UK","London");
		hm.put("Chaina","Beijing");
		hm.put(null,"Newjersy");
		
		
		//hm.clear();
		hm.replace("USA", "Baltimore");
		System.out.println(hm.size());
		hm.remove("India");
		
		System.out.println(hm.size());
		System.out.println(hm.containsKey("USA")); //true
		System.out.println(hm.containsValue("Washington")); //false
		
		System.out.println(hm.containsValue("Baltimore"));//true
		System.out.println(hm.containsValue("Newyork"));//true
		
		//loop through hashmap elements
				for (Map.Entry<String, String> entry :
		            hm.entrySet()) {
		           
		           System.out.println(entry.getKey() + " = "
		                              + entry.getValue());
		       }
				
	}
	@Test
	public void LearnArraylist()
	{
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("BMW"); //0
		cars.add("Audi"); //1
		cars.add("Benz"); //2
		cars.add("Dezire");
		cars.add("Bugati");
		cars.add("100");
		
		//cars.clear();
		cars.remove(0);
		System.out.println("Size is:" + cars.size()); //size:3
		System.out.println("contains bmw:" + cars.contains("BMW")); //expected : true
		System.out.println("contains Dezire:" + cars.contains("Dezire")); //expected : False
		System.out.println("Index of Audi:" + cars.indexOf("Audi")); //Index : 1
		
	}
	@Test
	public void LearnDictionary()
	{
		Dictionary<String, String> cars=new Hashtable();
		cars.put("BMW","Germany");
		cars.put("Audi","USA");
		cars.put("Benz","Japan");
		System.out.println("Size is:" + cars.size()); //size:3
		System.out.println("contains bmw:" + cars.get("Nissan")); //expected : true
		
	}
	@Test
	public void LearnSet()
	{
		 Set<String> hash_Set = new HashSet<String>(); 
		  
	        // Adding elements to the Set 
	        // using add() method 
	        hash_Set.add("One"); 
	        hash_Set.add("Two"); 
	        hash_Set.add("Three"); 
	        hash_Set.add("Four"); 
	        hash_Set.add("Five"); 
	  
	        // Printing elements of HashSet object 
	        //System.out.println(hash_Set); 
	         //hash_Set.clear();
	        Iterator value = hash_Set.iterator(); 
	        while (value.hasNext()) { 
	            System.out.println("value:" + value.next()); 
	        } 
	        
	        System.out.println(hash_Set.contains("India"));
	}
	
}


