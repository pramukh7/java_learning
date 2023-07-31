package apis;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {
	
	@Test
	public void testHeaders()
	{
		given()
		.when()
			.get("https://www.google.ca/")
		.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.header("Content-Encoding", "gzip")
		.header("Server", "gws")
		.log().all();
	}
	
	@Test
	public void testGetHeaders()
	{
		Response response = given()
		.when()
			.get("https://www.google.ca/");
		
		//get Single Header
		String contentTypeHeader = response.getHeader("Content-Type");
		System.out.println("Value of the Content Type Header is ==>"+contentTypeHeader);
		
		//get all headers
		Headers allHeader = response.getHeaders();
		for(Header header:allHeader)
		{
			System.out.println("============");
			System.out.println(header);
			System.out.println("============");
		}
	}

}
