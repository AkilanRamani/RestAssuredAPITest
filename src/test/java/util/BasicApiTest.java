package util;

import org.testng.annotations.Test;

public class BasicApiTest extends BaseTest {

    @Test
    public void T01_StatusCodeAndGetClientsTest() {
        res = RestAssuredUtil.getResponse("/users/2"); 
        testUtil.checkStatusIs200(res);
        jp =RestAssuredUtil.getJsonPath(res); 
       
        System.out.println(testUtil.getClients(jp)); // Passing the JSONPath as an input argument.
    }

    @Test
    public void T02_GetAndroidModelPackageOptions() {
        res = RestAssuredUtil.getResponse("/users/2");
        testUtil.checkStatusIs200(res);
        jp = RestAssuredUtil.getJsonPath(res);
        System.out.println("Opt: " + jp.get("x.data.email"));
       System.out.println("Description: " + jp.get("modelPackage.description"));
       System.out.println("Type: " + jp.get("modelPackage.type"));
    }
}

