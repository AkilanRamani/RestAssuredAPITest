package RestAssuredApiAutomation;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RestCallAPI {

	
	/*@Test
	public void testStatusCode() {
		
		RestAssured.baseURI= "https://bookstore.toolsqa.com/BookStore/v1";
		RequestSpecification httpRequest = RestAssured.given();
		//Passing the resource details
		Response res = httpRequest.queryParam("ISBN","9781449325862").get("/Book");
		//Retrieving the response body using getBody() method
		ResponseBody<?> body = res.body();
		//Converting the response body to string object
		String rbdy = body.asString();
		//Creating object of JsonPath and passing the string response body as parameter
		JsonPath jpath = new JsonPath(rbdy);
		//Storing publisher name in a string variable
		String title = jpath.getString("title");
		System.out.println("The book title is - "+title); 
	} */
	
	/*@Test
	public void testAssertions() {
		RestAssured.given().queryParam("ISBN", "9781449325862").when().get("https://bookstore.toolsqa.com/BookStore/v1/book").then().statusCode(200);
	} */
	
	/*@Test
	public void testAssertions1() {
		RestAssured.given().formParam("name", "morpheus").formParam("job", "leader").when().post("https://reqres.in/api/users").then().statusCode(200);
	} */
	
	@Test
	public void testAssertions11() {
		 RestAssured
		.given().get("https://reqres.in/api/users/2").then().log().ifStatusCodeMatches(Matchers.is(400));
		// JSONObject data = new JSONObject();
	//System.out.println(res.extract().asString());
	}
	}
	
	

	
