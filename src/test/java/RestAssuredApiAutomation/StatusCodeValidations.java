package RestAssuredApiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;

public class StatusCodeValidations {
	@Test
	public void statusCode() {
		
		RestAssured.given();
        
       //  RestAssured.registerParser("application/customer", Parser.XML);
		
         ValidatableResponse res = RestAssured.given().get("https://jsonplaceholder.typicode.com/users").then().defaultParser(Parser.XML).assertThat().contentType("application/json").log().all();
        System.out.print(res.extract().asPrettyString()); 
}
}