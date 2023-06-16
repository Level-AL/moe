package restAssuredTests;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
public class RestAssured_API_listAndVerify {
	public static void main(String[] args) {
		
		
		RestAssured.given().param("key","aea4928a11d18576c837c1c1eea191a1")
						   .param("token", "ATTAb82f442d97019e0e077a4d679d49ed65b96c1d801f40028750381e5379ff742a57C1DAC5")
						   .get("https://api.trello.com/1/members/me/boards").then()
						   .statusCode(200)
						   .body("id[0]", equalTo("648128e3aa6d13c4bc93359a")).body("name", hasItems("CallOfDuty"));
	
		
		
		System.out.println("passed");
		
		
		
		
		
	}
}
