package restAssuredTests;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_GET {

	public static void main(String[] args) {
		
		// set the base url 
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		//Create request object
		RequestSpecification httprequest = RestAssured.given();
		
		//response object
		Response myResponse = httprequest.request(Method.GET);
		
		
		//start validation and verification
		
		//prints in a single format
		//String responseBody = myResponse.getBody().asString();
		
		//prints in json
		//System.out.println("This is my response message: " + myResponse.getBody().asPrettyString());		
		
		//prints in json format - also printing extra data about data (metData)
		System.out.println("This is my response message: " + myResponse.then().log().all());

		//status code
		System.out.println(myResponse.getStatusCode());
		
		Assert.assertEquals(200, myResponse.getStatusCode() );
		
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
