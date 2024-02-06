package TestAutomation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRequestTest {
	
	
	 @Test
	    public void getMethodWithoutBDDApproach() {
	        RequestSpecification request = RestAssured.given();
	        request.baseUri("https://reqres.in/api/users/2");

	        Response response = request.get();
	        String res = response.asPrettyString();
	        System.out.println(res);
	        ValidatableResponse validatableResponse = response.then();
	        System.out.println(validatableResponse.toString());
	        // It will check if status code is 200
	        validatableResponse.statusCode(200) ;// verify that the response status code matches our specified expected integer value.
	        validatableResponse.body("$", Matchers.hasSize(2));
	 }}
