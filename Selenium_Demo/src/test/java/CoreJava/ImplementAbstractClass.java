package CoreJava;
import org.testng.annotations.Test;
public class ImplementAbstractClass extends AbstractClassAnimal
{

	public void animalSound()
	{
		System.out.println("Animal sound method in child class");
	}
	
	public void DisplayAnimalName()
	{
		System.out.println("elephant");
	}
	
	@Test
	public void callAbsMethod()
	{
		ImplementAbstractClass objChild=new ImplementAbstractClass();
		objChild.animalSound();
		objChild.DisplayAnimalName();
		
		
	}
}
