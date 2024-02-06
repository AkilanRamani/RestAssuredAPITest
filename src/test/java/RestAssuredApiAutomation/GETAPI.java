package RestAssuredApiAutomation;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ValidatableResponse;

public class GETAPI {
	@Test
	public void testResponse() {
		
        String  a = RestAssured.given().get("https://reqres.in/api/users/2").asPrettyString();
		//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("aa"));
        JsonPath jp = new JsonPath(a);
      ContentType type = ContentType.JSON;
       //System.out.println ( jp.get(a));
     //  System.out.print(jp.get());
       
       
		//System.out.println(a);
		
		
}

	/*@Test
	public void testResponseSchemaGeneration() {
		
   // RestAssured.given().get("https://reqres.in/api/users/2").then().
        	//	assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("C:\\Users\\akilan-18633\\eclipse-workspace\\RestAssuredAPITest\\data\\jsonschemavalidation.json"));
		//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("aa"));
		//System.out.println(a);
		
		Response res = RestAssured.given().get("https://reqres.in/api/users/2");
		ValidatableResponse r1 = res.then().assertThat();
		Matcher<String> m = JsonSchemaValidator.matchesJsonSchemaInClasspath("..//RestAssuredAPITest//data//jsonschemavalidation.json");
		ValidatableResponse res1 = r1.body(m);
		System.out.println(res1.extract().asPrettyString()); */
	}
