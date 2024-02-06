package TestAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JSONPostRequest {
	
	@Test
	public void postMethod() throws FileNotFoundException {
	String jsonAsString;
	Response ResponseObject;
	String path = "C:\\Users\\akilan-18633\\eclipse-workspace\\RestAssuredAPITest\\JSONFile\\JSONRequest.json";
	File file = new File(path); 
	FileInputStream jsonFile = new FileInputStream(file);
	System.out.println(jsonFile);
	
	ResponseObject = null;
	ResponseObject = RestAssured.given()
			.contentType("application/json")
			.and().body(jsonFile.toString())
			.when().post("https://reqres.in/api/users")
			.then().and()
			.log().body()
			.statusCode(201).extract()
			.response();
	
	jsonAsString = ResponseObject.asString();
	System.out.println(jsonAsString);
	
	
	int statusCode = ResponseObject.getStatusCode();
    Assert.assertEquals(statusCode , 201);
    
    @SuppressWarnings("deprecation")
	JsonObject jsonObject = new JsonParser().parse(jsonAsString).getAsJsonObject();
	String FirstName = jsonObject.getAsJsonObject("UserDetails").get("FirstName").getAsString();
	System.out.println("FirstName response value = "+FirstName);
	Assert.assertEquals("Saravanan", FirstName);
	}	
}


