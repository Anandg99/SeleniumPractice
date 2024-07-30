package CoreJava;
import org.testng.annotations.Test;

public class clsChild extends clsClassP 
{

	public void GetStudCity()
	{
		System.out.println("Hyderabad");
	}
	@Override
	public void DisplayName(String sname)
	{
		System.out.println("Student name from child is:" + sname);
	}
	
	public int age=35;
	
	@Test
	public void LearnOverriding()
	{
		clsChild objChild=new clsChild();
		objChild.DisplayName("Hari");
		
		clsClassP objP=new clsChild();
		objP.DisplayName("Anand");
		System.out.println(objP.age);
	}
}
