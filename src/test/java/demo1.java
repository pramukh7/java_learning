import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class demo1 {

	private static String POST_RESOURCE = "/maps/api/place/add/json";
	private static String PUT_RESOURCE = "/maps/api/place/update/json";
	private static final String KEY = "qaclick123";
	private static final String GET_RESOURCE = "/maps/api/place/get/json";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//given := All input details
		//when := Submit the API like how to submit request Post or Get or Patch
		//then := Validate the response
		
		//to log request add log().all() method after giver() method
		//to log response add og().all() method after then() method
				
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given()
		//.log()
		//.all()
		.queryParam("key", KEY)
		.header("Content-Type","application/json")
		.body(Payloads.postPlaceMapPayload())
		.when()
		.post(POST_RESOURCE)
		.then()
		//.log()
		//.all()
		.assertThat()
		.statusCode(200)
		.assertThat()
		.body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.41 (Ubuntu)")
		.extract()
		.response()
		.asString();
		
		JsonPath jsp = new JsonPath(response);
		String placeId = jsp.getString("place_id");
		
		//after add Post Map grap the Place ID and update the place
		//after use ID to get the Placed Map from the Google server
		given()
		.queryParam("key", KEY)
		.header("Content-Type","application/json")
		.body(Payloads.putPlaceMapPayload(placeId))
		.when()
		.put(PUT_RESOURCE)
		.then()
		.assertThat()
		.statusCode(200)
		.body("msg", equalTo("Address successfully updated"))
		.header("server", "Apache/2.4.41 (Ubuntu)");
		
		//System.out.println(putResponse);
		
		String getResponse = given()
		.queryParam("key", KEY)
		.queryParam("place_id", placeId)
		.header("Content-Type", "application/json")
		.when()
		.get(GET_RESOURCE)
		.then()
		.statusCode(200)
		.extract()
		.response()
		.asString();
		
		jsp = new JsonPath(getResponse);
		
		if(jsp.get("address").equals("73 winter walk, USA"))
		{
			System.out.println(getResponse);
			System.out.println("SuccessFully Address Updated== >" 
		+jsp.get("address") );
		}
}

}
