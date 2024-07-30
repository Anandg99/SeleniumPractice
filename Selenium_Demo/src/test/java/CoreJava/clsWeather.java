package CoreJava;
import org.testng.annotations.Test;
public class clsWeather 
{
  String City="Hyderabad";
  int Zipcode=502032;
  
  public int GettempByCity(String strCity)
  {
	  int currentTemp=0;
	  
	  if(strCity=="Hyderabad")
	  {
		  currentTemp=40;
	  }
	  else if(strCity=="Secunderabad")
	  {
		  currentTemp=38;
	  }
	  else if(strCity=="Beeramguda")
	  {
		  currentTemp=36;
	  }
	  else
	  {
		  currentTemp=0;
	  }
	  
	  return currentTemp;
  }
  
  @Test
  public void VerifyTemp()
  {
	  int temp=GettempByCity("xyz");
	  System.out.println("Current temp is:" + temp);
  }
}
