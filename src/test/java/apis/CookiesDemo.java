package apis;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {
	
	@Test
	public void testCookies()
	{
		Response response = given()
		.when()
			.get("https://www.google.ca/");
		System.out.println("Single Cookie =>" + response.getCookie("AEC"));
		
		Map<String, String> allCookies = response.getCookies();
		Set<String> e = allCookies.keySet();
		for(String cookie:e)
		{
			System.out.println("(KEY)=> "+cookie+ " (Value)=> "+allCookies.get(cookie));
		}
	}

}
