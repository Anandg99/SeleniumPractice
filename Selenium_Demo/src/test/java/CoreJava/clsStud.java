package CoreJava;
import org.testng.annotations.*;
public class clsStud 
{

	public String  GetStudBySno(int sno)
	{
		String sname="";
		
		if(sno==100)
		{
			sname="Anand";
		}
		else if(sno==200)
		{
			sname="Hari";
		}
		else if(sno==300)
		{
			sname="kiran";
		}
		else
		{
			sname="unknown";
		}
		
		return sname;
	}
	
	@Test
	public void LearnAccessModifiers()
	{
		clsMethods objM=new clsMethods();
		//objM.
	}
}
