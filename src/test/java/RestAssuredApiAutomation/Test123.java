package RestAssuredApiAutomation;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JacksonException;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test123 {

	@Test
	public void httpPostMethod() throws JacksonException, InterruptedException {
	    //Rest API's URL
	    String restAPIUrl = "https://reqres.in/";

	    //API Body
	    String apiBody = "{\r\n"
	    		+ "    \"name\": \"morpheus\",\r\n"
	    		+ "    \"job\": \"leader\"\r\n"
	    		+ "}";

	    // Building request by using requestSpecBuilder
	    RequestSpecBuilder builder = new RequestSpecBuilder();

	    //Set API's Body
	    builder.setBody(apiBody);

	    //Setting content type as application/json
	    builder.setContentType("application/json; charset=UTF-8");
	    
	    RequestSpecification requestSpec = builder.build();

	    //Making post request with authentication or leave blank if you don't have credentials like: basic("","")
	    Response response = RestAssured.given().
	        spec(requestSpec)
	        .when()
	        .post(restAPIUrl);
	    
	   String res = response.asString();
	    
	   JsonPath jp = new JsonPath(res);
      ArrayList<?> list = jp.get();
      System.out.println(list);
      
	    //Get the desired value of a parameter
	 //   String result = JSONResponseBody.getString({ key });

	    //Check the Result
	  //  Assert.assertEquals(jp.get("name"), "morpheus");
	}
	}


