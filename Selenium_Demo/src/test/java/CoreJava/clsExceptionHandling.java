package CoreJava;

import org.testng.annotations.*;

public class clsExceptionHandling {
	@Test
	public void LearnExceptionHandling() {
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
		} 
		catch (Throwable ex) 
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace().toString());
			StackTraceElement[] stktrace
            = ex.getStackTrace();

        // print element of stktrace
        for (int i = 0; i < stktrace.length; i++) {

            System.out.println("Index " + i
                               + " of stack trace"
                               + " array contains = "
                               + stktrace[i].toString());

		}
		}
		/*
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace().toString());

		}*/
	}
	@Test
	public void LearnException1()
	{
		try
		{
		   // Taking an empty string
        String str = null;
        // Getting length of a string
        System.out.println(str.length());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	@Test
	public void LearnException2()
	{
		try
		{
			int a = 5;
			int b = 0;
		    int c=a/b;
		}
		
		catch(ArithmeticException  ex1)
		{
			System.out.println(ex1.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	@Test
	public void ArrayIndexException()
	{
		 try {
	            int number[] = new int[20];
	            number[21] = 30 / 0;
	            // this statement will throw
	            // ArrayIndexOutOfBoundsException e
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
		 	{
	            System.out.println(e.getMessage());
	            // print the message
	        }
		
	}
}
