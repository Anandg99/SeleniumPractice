package CoreJava;

import org.testng.annotations.*;

public class clsMethods {

	public String country = "USA";
	public static String Uname = "MIT";

	public void DisplayName() {
		System.out.println("Display name method");
	}

	public void DisplayName(String strCountry) {
		System.out.println("Country name is: " + strCountry);
	}

	public int GetWeatherByCity(String cityName) {
		int temp = 0;
		if (cityName == "Dallas") {
			temp = 30;
		} else if (cityName == "Boston") {
			temp = 28;

		} else if (cityName == "Chicago") {
			temp = 27;

		} else {
			temp = 25;
		}
		return temp;
	}

	public boolean isMajor(int age) {
		if (age < 18) {
			return false;
		} else {
			return true;
		}
	}

	@Test
	public void InvokeMethods() {
		clsMethods objM = new clsMethods();
		System.out.println(clsMethods.Uname);
		objM.DisplayName("India");
		int currentTemp = objM.GetWeatherByCity("Boston");
		System.out.println("Temparature is : " + currentTemp);
		boolean chkMajor=objM.isMajor(16);
		System.out.println("Student is Major : " + chkMajor);
		
	}
}
