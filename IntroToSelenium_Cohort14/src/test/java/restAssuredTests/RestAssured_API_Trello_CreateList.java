package restAssuredTests;

import org.testng.Assert;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_API_Trello_CreateList {
	public static void main(String[] args) {
		String key = "aea4928a11d18576c837c1c1eea191a1";
		String token = "ATTAb82f442d97019e0e077a4d679d49ed65b96c1d801f40028750381e5379ff742a57C1DAC5";
		Faker faker = new Faker();
		String boardId = "648128e3aa6d13c4bc93359a";
		String RandomListName = faker.superhero().name();
		
		System.out.println(RandomListName);
		
		
		//RestAssured base url
		RestAssured.baseURI = "https://api.trello.com/1/lists";
		
		// create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type","application/json");
		
		Response myResponse = httpRequest.post(RestAssured.baseURI + "?name=" + RandomListName + "&idBoard="+ boardId +"&key=" + key + "&token=" + token);
		
		int statusCode = myResponse.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
}
