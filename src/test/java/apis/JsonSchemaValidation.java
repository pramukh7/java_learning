package apis;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class JsonSchemaValidation {

private static final String URL = "https://reqres.in/api/users?page=2";
	
		@Test
		public void testGetUser()
		{
			given()
			.when()
				.get(URL)
			.then()
			.assertThat()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("usersSchema.json"));
			
		}
}
