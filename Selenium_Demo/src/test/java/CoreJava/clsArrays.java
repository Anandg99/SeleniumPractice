package CoreJava;

import java.util.Map;

import org.testng.annotations.Test;

public class clsArrays {

	@Test
	public void LearnInTArray() {
		int arrNums[] = new int[3];
		arrNums[0] = 100;
		arrNums[1] = 200;
		arrNums[2] = 300;
		System.out.println(arrNums[2]);
	}

	@Test
	public void EvennumbersArray() {
		int arrEvennums[] = new int[5]; // 0 1 2 3 4 
		arrEvennums[0] = 0;
		arrEvennums[1] = 2;
		arrEvennums[2] = 4;
		arrEvennums[3] = 6;
		arrEvennums[4] = 8;
		//arrEvennums[5] = 10;
		
		System.out.println("Array length is" + arrEvennums.length);
		System.out.println("3rd element is:" + arrEvennums[2]);
		for(int i=0;i<arrEvennums.length;i++)
		{
			System.out.println(arrEvennums[i]);
		}
		/*
		for (int num : arrEvennums) 
		{

			System.out.println(num);
		}
		*/
	}

	@Test
	public void LearnStringArray() {
		String arrCities[] = new String[3];
		arrCities[0] = "Hyderabad";
		arrCities[1] = "Chennai";
		arrCities[2] = "Mumbai";
		// arrCities[3]="Rajashtan"; // array index out side the bounds

		System.out.println("Length is:" + arrCities.length);
		/*
		 * for(int i=0;i<arrCities.length;i++) { System.out.println(arrCities[i]); }
		 */

		for (String city : arrCities) 
		{

			System.out.println(city.toString());
		}

	}

	@Test
	public void Learn2DArray() {
		String[][] arrCities = new String[3][2];
		arrCities[0][0] = "Hyderabad";
		arrCities[0][1] = "Chennai";

		arrCities[1][0] = "Mumbai";
		arrCities[1][1] = "Delhi";

		arrCities[2][0] = "VJA";
		arrCities[2][1] = "Nellore";

		System.out.println("Row count is:" + arrCities.length); // 0 1 2
		System.out.println("Col count is:" + arrCities[0].length); // 0 1

		for (int i = 0; i < arrCities.length; i++) {
			for (int j = 0; j < arrCities[0].length; j++) {
				System.out.println(arrCities[i][j]);
			}

		}

	}

}
