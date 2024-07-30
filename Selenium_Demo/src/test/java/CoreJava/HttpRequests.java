package CoreJava;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import io.restassured.matcher.RestAssuredMatchers;

import io.restassured.*;
import io.restassured.RestAssured;
import io.restassured.matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.json.JSONObject;
public class HttpRequests 
{
	@Test
	public void VerifyPendingPets()
	{
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("id", 197);
		//String expectedID="9223372036854639594L";
		given()
		.contentType("application/json")
		.queryParam("status","pending")
     	.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus")
		.then()
		.statusCode(200)
		.body("id[0]", Matchers.contains("9223372036854639594L"))
		.log().body();	
		
	}
	@Test
	public void testcase2()
	{
		
	}
	@Test
	public void testcase3()
	{
		//added test case2 for github check
	}
	@Test
	public void testcase4()
	{
		//added test case4 for github checking
	}
	
	
	@Test
	public void VerifyAvailablePets()
	{
		given()
		.contentType("application/json")
		.queryParam("status","Available")
     	.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test
	public void VerifyGetpetByPetID()
	{
		int petID=82321725;
				given()
		.contentType("application/json")
		.queryParam("status","Available")
     	.when()
		.get("https://petstore.swagger.io/v2/pet/" + petID)
		.then()
		.statusCode(200)
		.log().all();
	}
}
