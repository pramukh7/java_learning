package apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.HashMap;
import java.util.Map;

/*
 * Given() - get, post, put, delete, patch request
 * When() 
 * Then() - Validate status code, extract response, extract headers, cookies and response body.
 */
public class FirstAPIRequest {

	String id;
	private static final String URL = "https://reqres.in/api/users";
	private static final String CONTENT_TYPE = "application/json";
	@Test
	public void testGetUsers()
	{
		//if given() didn't require we can remove and start with when()
		when().get(URL+"?page=2")
		.then()
		.statusCode(200)
		.body("page", equalTo(2))
		.body("data.first_name[0]", equalTo("Michael"))
		.log().all();
	}
	
	@Test
	public void testCreateUser()
	{
		HashMap<String, String> data = new HashMap<>();
		data.put("name", "Maharaj");
		data.put("job", "swami");
		
		Map<String, String> response = given()
		.contentType(CONTENT_TYPE)
		.body(data)
		.when()
		.post(URL)
		.jsonPath().getMap(DEFAULT_BODY_ROOT_PATH);
		id = response.get("id");
		Assert.assertNotNull(response.get("id"));
		System.out.println("NEW USER CREATED==>"+id);
		System.out.println(response);
	}
	
	@Test(dependsOnMethods = {"testCreateUser"})
	//update User
	public void testUpdateUser()
	{
		Map<String, String> data = new HashMap<>();
		data.put("name", "Swaminarayan");
		data.put("job", "Mox Data");
		
		Map<String, String> response = given()
		.contentType(CONTENT_TYPE)
		.body(data)
		.when()
		.put(URL+"/"+id)
		.jsonPath().getMap(DEFAULT_BODY_ROOT_PATH);
		
		System.out.println("UPDATE USER FOR THIS USER ID [ " + id +" ]");
		System.out.println(response);
	}
	
	@Test
	public void deleteUser() {
		//given() ignore because there is no prerequisite
		when().delete(URL+"/"+id)
		.then().statusCode(204);
	}
}
