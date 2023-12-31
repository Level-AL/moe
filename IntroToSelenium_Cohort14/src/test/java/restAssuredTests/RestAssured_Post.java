package restAssuredTests;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssured_Post {

	public static void main(String[] args) {

		// set the base url 
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		//Create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//request post request
		//add data and body usins json
		JSONObject myJson = new JSONObject();
		
		myJson.put("page", 73);
		myJson.put("per page",  36);
		myJson.put("total", 10);
		myJson.put("total pages", 2022);
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(myJson.toJSONString());
		
		//send the post request
		Response myResponse = httpRequest.request(Method.POST);
		
		System.out.println("This is my response message: " + myResponse.then().log().all());
		
		int statusCode = myResponse.getStatusCode();
		Assert.assertEquals(statusCode, 201 );

		
		
		
		
		
		
		
		
	}
}
