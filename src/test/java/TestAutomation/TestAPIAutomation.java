package TestAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TestAPIAutomation {

	
		@SuppressWarnings("deprecation")
		@Test
		public void getMethod() {
		String jsonAsString;
		Response ResponseObject;
		ResponseObject = null;
		ResponseObject = RestAssured.given()
				.contentType("application/json").and()
				.when().get("https://reqres.in/api/users?page=2")
				.then().and()
				.log().body()
				.statusCode(200) 
				.extract().response();
		//Converting response as String
		jsonAsString = ResponseObject.asString();
		System.out.println(jsonAsString);
		Headers headers = ResponseObject.getHeaders();
		System.out.println("The Header is " + headers);
	   String a = headers.getValue("Content-Type");
	   System.out.println("The header value is " + a);
	   RestAssured.baseURI = "https://reqres.in";
	   
	   System.out.println(RestAssured.baseURI);
	   int statusCode = ResponseObject.getStatusCode();
	    Assert.assertEquals(statusCode , 200);
		//Converting to JSON Object
	   // JsonParser parser = new JsonParser();
	    JsonParser parser = new JsonParser();
	    JsonElement element = parser.parse(jsonAsString);
	    System.out.println("The Ele " + element);
		//JsonObject jsonObject = parser.parse(jsonAsString).getAsJsonObject();
	   JsonObject jsonObject =  element.getAsJsonObject();
		String total = jsonObject.get("per_page").getAsString();
		System.out.println("per_page response value = "+total);
		Assert.assertEquals("6", total);
		
		//Reading Array Object From Response
		JsonArray arrayObject = jsonObject.getAsJsonArray("data"); // which will return all an array data that resides within the JSON Object.
		System.out.println("The Array is " +  arrayObject);
		for (int i = 0; i < arrayObject.size(); i++) { // size is 5 , i<5
			String taskStatus = arrayObject.get(i).getAsJsonObject().get("id").getAsString();
			System.out.println(taskStatus);
		}
	}
	}


