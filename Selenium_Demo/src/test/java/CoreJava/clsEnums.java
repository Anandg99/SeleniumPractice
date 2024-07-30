package CoreJava;
import org.testng.annotations.Test;
public class clsEnums {
	enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }
	@Test
	public void LearnEnums()
	{
		Level _level=Level.LOW;
		System.out.println("Level is:" + _level);
		
	}
}