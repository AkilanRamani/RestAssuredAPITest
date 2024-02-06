package RestAssuredApiAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

public class TestCase1API {
	
	//URL url;
	@Test
	public void testStatusCode() {
		
		/*try {
		//	 url = new URL("https://jsonplaceholder.typicode.com/posts/3");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		//RestAssured.given().get("https://jsonplaceholder.typicode.com/posts/3").then().statusCode(200);
		RestAssured.given().request("GET","https://reqres.in/api/users/2" ).then().statusCode(200);
	}
	
	
	
	 @Test
	public void checkResponse() {
		
	/*	try {
			 url = new URL("https://jsonplaceholder.typicode.com/posts/3");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		ValidatableResponse res = RestAssured.given().get("https://jsonplaceholder.typicode.com/posts/3").then();
		res.assertThat().statusLine("HTTP/1.1 200 OK");
	   
	    
		//System.out.println(res.extract().toString());
	} 
	
	@Test
	public void validateResponse() {
		
		/*try {
			 url = new URL("https://jsonplaceholder.typicode.com/posts/3");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		RestAssured.given().get("https://jsonplaceholder.typicode.com/posts/3").then().log().all();
		
		//System.out.println(res.extract().toString());
	} 
	
	
	@Test
public void checkResponse1() {
		
		/*try {
			 url = new URL("https://reqres.in/api/users/2");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		RestAssured.given().get("https://reqres.in/api/users/2").then().log().all();
		
		Response res = RestAssured.given().post();
		String a = res.asString();
		
		
		//System.out.println(res.extract().toString());
	
	}
		
	@Test
	public void verifyResponseFields() {
		
	//String urlpath = "https://reqres.in/api/users/2";
		
		
	RestAssured.given().get("https://dummy.restapiexample.com/api/v1/employees").then().
	body("x.status" , Matchers.equalTo("success"));
	
		//System.out.println(res.extract().toString()); */
	
	}
	
	
	}
	


