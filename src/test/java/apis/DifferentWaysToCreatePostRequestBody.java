package apis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
/*
 * 1) using HashMap
 * 2) using org.json library
 * 3) using POJO class(plain old java object)
 * 4) external json file.
 */
public class DifferentWaysToCreatePostRequestBody {

	private static final String URL = "https://reqres.in/api/users";
	private static final String CONTENT_TYPE = "application/json";
	//1) using HashMap
	//@Test
	public void createUserUsingHashMap()
	{
	
		Map<String, String> data = new HashMap<>();
		data.put("name", "Jai Swaminarayan");
		data.put("job", "Mox na Datar");
		
		Map<String, String> response = given()
			.contentType(CONTENT_TYPE)
			.body(data)
		.when()
			.post(URL).jsonPath().getMap(DEFAULT_BODY_ROOT_PATH);
		Assert.assertNotNull(response.get("id"));
		Assert.assertEquals(response.get("name"), "Jai Swaminarayan");
		Assert.assertEquals(response.get("job"), "Mox na Datar");
		System.out.println("CREATED USER [ " + response.get("id") +" ]");
		System.out.println(response);
	}
	
	//2) using org.json library
		//@Test
		public void createUserUsingOrgJsonLibrary()
		{
		
			JSONObject data = new JSONObject();
			data.put("name", "Jai Swaminarayan");
			data.put("job", "Mox na Datar");
			
			Map<String, String> response = given()
				.contentType(CONTENT_TYPE)
				.body(data.toString())
			.when()
				.post(URL).jsonPath().getMap(DEFAULT_BODY_ROOT_PATH);
			Assert.assertNotNull(response.get("id"));
			Assert.assertEquals(response.get("name"), "Jai Swaminarayan");
			Assert.assertEquals(response.get("job"), "Mox na Datar");
			System.out.println("CREATED USER [ " + response.get("id") +" ]");
			System.out.println(response);
		}
		
		//3) using POJO class
		//@Test
		public void createUserUsingPOJO()
			{
				
			User user = new User();
			user.setName("Vaishali");
			user.setJob("IT specialist");
					
			Map<String, String> response = given()
				.contentType(CONTENT_TYPE)
				.body(user)
				.when()
				.post(URL).jsonPath().getMap(DEFAULT_BODY_ROOT_PATH);
			Assert.assertNotNull(response.get("id"));
			Assert.assertEquals(response.get("name"), "Vaishali");
			Assert.assertEquals(response.get("job"), "IT specialist");
			System.out.println("CREATED USER [ " + response.get("id") +" ]");
			System.out.println(response);
		}
		
		//4) using External json file
		@Test
		public void createUserUsingExternalJsonFile() throws FileNotFoundException
		{
						
		File file = 
				new File("C:\\dev\\Sanjay\\extraworkspace\\RestAssuredAutomation\\src\\test\\java\\apis\\user.json");
		FileReader fr = new FileReader(file);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject(jt);
					
							
					Map<String, String> response = given()
						.contentType(CONTENT_TYPE)
						.body(jo.toString())
						.when()
						.post(URL).jsonPath().getMap(DEFAULT_BODY_ROOT_PATH);
					Assert.assertNotNull(response.get("id"));
					Assert.assertEquals(response.get("name"), "Akshar");
					Assert.assertEquals(response.get("job"), "Sadhu");
					System.out.println("CREATED USER [ " + response.get("id") +" ]");
					System.out.println(response);
				}
}
