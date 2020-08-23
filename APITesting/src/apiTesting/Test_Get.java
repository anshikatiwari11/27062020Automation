package apiTesting;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test_Get {
	
    @Test
	public void test1() {
		//End Point 
		String endPoint="http://fakerestapi.azurewebsites.net/api/Books";
		
		RestAssured.baseURI=endPoint; //Step 1
		
		RequestSpecification request = RestAssured.given(); //Step 2.
		
		//Add Headers
		//Add Bady
		Response response =request.request(Method.GET);
		
		int statusCode=response.getStatusCode();
		//System.out.println(statusCode);
		//System.out.println(response.asString());
		
		Assert.assertEquals(statusCode, 200);
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		List list= jsonPathEvaluator.get("ID");
		System.out.println(list.size());
		Object id = jsonPathEvaluator.get("ID[0]");
		Object title = jsonPathEvaluator.get("Title[0]");
		
		Assert.assertEquals(id,1);
		Assert.assertEquals(title,"Book 1");
		//Validate response

	}

}
