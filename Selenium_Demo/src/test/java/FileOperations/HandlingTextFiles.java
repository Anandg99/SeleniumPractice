package FileOperations;

import org.testng.annotations.Test;
import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class HandlingTextFiles {
	@Test
	public void CreateTextFile() {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Anand_Details\\SampleFile1.txt");
			fout.write(65);
			fout.write(78);
			fout.write(65);
			fout.write(78);
			fout.write(68); //D
			
			fout.write(10); //new line
		
			fout.write(65);
			fout.write(78);
			fout.write(65);
			fout.write(78);
			fout.write(68); //D
			
			
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void WriteinFile()
	{
		 try{    
             FileOutputStream fout=new FileOutputStream("C:\\Anand_Details\\SampleFile2.txt");    
             String s="Hello world";    
             byte b[]=s.getBytes();//converting string into byte array    
             
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}  
	}
	/*
	@Test
	public void AppendInFile() throws IOException
	{
		String textToAppend = "Happy Learning !!";
		String filePath = "C:\\Anand_Details\\SampleFile2.txt";

		try(FileWriter fw = new FileWriter(filePath, true);
		BufferedWriter writer = new BufferedWriter(fw);) {

		  writer.write(textToAppend);
		  writer.write("Line3");
		  
		}  
	}*/
	@Test
	public void ReadFile()
	{
		try{    
            FileInputStream fin=new FileInputStream("C:\\Anand_Details\\SampleFile2.txt");    
           int i=fin.read();  
            System.out.println(i);
                
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
	}
	@Test
	public void ReadTextFile()
	{
		 try{    
	            FileInputStream fin=new FileInputStream("C:\\Anand_Details\\SampleFile2.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1)
	            {    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }
		 catch(Exception e)
		 {System.out.println(e);}    
	}
	@Test
	public void ReadTextFile2()
	{
		try {
		      File myObj = new File("C:\\Anand_Details\\SampleFile2.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) 
		      {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } 
		catch (FileNotFoundException e) 
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
	@Test
	public void DeleteFile()
	{
		File myObj = new File("C:\\Anand_Details\\SampleFile2.txt"); 
	    if (myObj.delete()) 
	    { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else 
	    {
	      System.out.println("Failed to delete the file.");
	    } 
	}
	@Test
	public void GetFileInfo()
	{
		File myObj = new File("C:\\Anand_Details\\SampleFile2.txt");
	    if (myObj.exists()) 
	    {
	      System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	    } 
	    else 
	    {
	      System.out.println("The file does not exist.");
	    }
	}
}
