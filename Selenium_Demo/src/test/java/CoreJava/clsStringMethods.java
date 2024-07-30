package CoreJava;
import org.testng.annotations.*;

public class clsStringMethods 
{
@Test
public void GetIndexOfString()
{
	String txt = "Please locate where 'locate' occurs!";
	System.out.println(txt.indexOf("locate")); // Outputs 7
	System.out.println(txt.indexOf("where")); // Outputs 14
}
@Test
public void GetSubfString()
{
	String txt = "Please locate where 'locate' occurs!";
	System.out.println(txt.substring(3,10)); //Index starts with 0: ase loc
	
}
@Test
public void GetSQRRoot()
{
    int num=100;
	System.out.println(Math.sqrt(num) + 0.40);
	System.out.println(Math.abs(Math.sqrt(num)));
}
@Test
public void PrintRandomNumbers()
{
	int randomNum = (int)(Math.random() * 101);  // 0 to 100
	System.out.println(randomNum);
	
}
@Test
public void MathMin()
{
	int randomNum = Math.min(0, 20);  
	System.out.println(randomNum);
	
}

}
