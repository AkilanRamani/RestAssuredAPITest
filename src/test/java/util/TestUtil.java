package util;

import java.util.ArrayList;
import java.util.Map;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestUtil {

	
	public void checkStatusIs200(Response res) {
        Assert.assertEquals(res.getStatusCode(), 200, "Status Check Failed!");
    }

    
    public <T> Map<T,T> getClients(JsonPath jp) {
        return jp.get();
    }
}

