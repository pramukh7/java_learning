package apis;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class PathAndQueryParamDemo {

	private static final String URL = "https://reqres.in/api/";
	
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
}
