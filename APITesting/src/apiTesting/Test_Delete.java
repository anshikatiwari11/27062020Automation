package apiTesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test_Delete {

	@Test
	public void test4()
	{// End Point
		String endPoint = "http://dummy.restapiexample.com/api/v1/delete/42";

		RestAssured.baseURI = endPoint; // Step 1

		RequestSpecification request = RestAssured.given(); // Step 2.

		// Body
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Manoj Shinde");
		requestParams.put("salary", "5678");
		requestParams.put("age", "26");
		// Header
		request.header("Content-Type", "application/json");

		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());

		Response response = request.request(Method.DELETE);

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(response.asString());
	}
}