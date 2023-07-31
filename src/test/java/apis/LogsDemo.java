package apis;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class LogsDemo {
	
	@Test
	public void testLogsMethod()
	{
		given()
		.when()
			.get("https://www.google.ca/")
		.then()
			//.log().all(); //will print full log on console
			//.log().cookies(); //will print only cookies on console
			.log().headers(); //will print only headers on console
	
	}

}
