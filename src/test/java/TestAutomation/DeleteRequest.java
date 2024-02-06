package TestAutomation;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
	
	
	 /*  @Test
	    public void deleteMethodWithoutBDDApproach() throws URISyntaxException, MalformedURLException {
	       String Id = "2";
	        URL url = null;

	        RequestSpecification request = RestAssured.given();
	        request.basePath("https://reqres.in/api/users");
	     
	        request.pathParam("id" , Id);
	       Response response = request.delete("/{id}");
	      //  request.delete
	        

	        // Let's print response body.
	        String responseString = response.asString();
	        System.out.println("Response Details : " + responseString);
	        ValidatableResponse validatableResponse = response.then();
	        // It will check if status code is 200
	        validatableResponse.statusCode(204);
	    } */

	    @Test
	    public void deleteMethodWithBDDApproach() {
	        String requestEmployeeId = "1";
	        RestAssured.given() //precondition is to give the base uri
	                .baseUri("http://localhost:8088/")
	                .pathParam("employee_id", requestEmployeeId)
	                .when() //actual action is to perform the delete request
	                .delete("employees/{employee_id}")
	                .then() // will return the ValidatadleResponse from the Response object
	                .statusCode(200); 
	    }
	

}
