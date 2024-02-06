package util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredUtil {
	
	public static void setBaseURI() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    //Sets base path
    public static void setBasePath(String basePathTerm) {
        RestAssured.basePath = basePathTerm; 
    }

    //Reset Base URI (after test)
    public static void resetBaseURI() {
        RestAssured.baseURI = null;
    }

    //Reset base path
    public static void resetBasePath() {
        RestAssured.basePath = null;
    }

    //Sets ContentType
    public static void setContentType(ContentType Type) {
       RestAssured. given().contentType(Type);
    }

    //Returns response by given path
    public static Response getResponse(String path) {
        return RestAssured.given().get(path);
    }

    //Returns response
    public static Response getResponse() {
        return RestAssured.given().get();
    }

    //Returns JsonPath object
    public static JsonPath getJsonPath(Response res) {
        String json = res.asString();
        return new JsonPath(json);
    }
}


