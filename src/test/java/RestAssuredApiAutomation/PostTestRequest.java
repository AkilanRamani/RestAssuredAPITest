package RestAssuredApiAutomation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostTestRequest {
	
	@Test
    public void postBodyWithObject() { 
        Employe inputBody = new Employe("morpheus", "leader");
        
       ContentType json =  ContentType.JSON;
       String name = json.getAcceptHeader(); // this is a data content type that is usually set in case of setting the Request as Well as the Response content type.
       //https://reqres.in/api/users
       System.out.println(name); 
       RestAssured.given()
                .baseUri("https://reqres.in/api")
                .body(inputBody)
                .contentType(json)
                .when()
                .post("/inputBody")
                .then()
                .statusCode(201)
                 .body("id", Matchers.notNullValue())
                .body("name", Matchers.equalTo("morpheus"))
                .body("job", Matchers.equalTo("leader")); 
                
    }

}
