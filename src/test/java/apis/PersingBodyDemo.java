package apis;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.LinkedHashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PersingBodyDemo {

	private static final String URL = "https://reqres.in/api/";
	
	//approach 1
	@Test
	public void getUser()
	{
		given()
			.pathParam("myParam", "users")
			.queryParam("page", 2)
			.queryParam("id", 5)
		.when()
			.get(URL+"{myParam}")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	//approach 2
		@Test
		public void testGetUser()
		{
			Response res = given()
				.pathParam("myParam", "users")
				.queryParam("page", 2)
				.queryParam("id", 5)
			.when()
				.get(URL+"{myParam}");
			String firstName = res.jsonPath().get("data.first_name");
			String lastName = res.jsonPath().get("data.last_name");
			Assert.assertEquals(firstName, "Charles");
			Assert.assertEquals(lastName, "Morris");
			
		}
		
		//approach 3 when list of Users return
				@Test
				public void testGetUsers()
				{
					Response res = given()
						.pathParam("myParam", "users")
						.queryParam("page", 2)
						.when()
						.get(URL+"{myParam}");
					String firstName = res.jsonPath().get("data.first_name[4]");
					String lastName = res.jsonPath().get("data.last_name[4]");
					Assert.assertEquals(firstName, "George");
					Assert.assertEquals(lastName, "Edwards");
					System.out.println("====================");
					String first_name = res.jsonPath().get("data[0].first_name");
					System.out.println(first_name);
					
				}
}
