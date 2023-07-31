package apis;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class IterateToJsonBody {

private static final String URL = "https://reqres.in/api/users?page=2";
	
		@Test
		public void testGetUser()
		{
			Response res = given()
					.contentType(ContentType.JSON)
			.when()
				.get(URL);
			
			JSONObject jsonObject = new JSONObject(res.asString());
			for(int i=0;i<jsonObject.getJSONArray("data").length();i++)
			{
				String emailId = 
						jsonObject
						.getJSONArray("data")
						.getJSONObject(i)
						.get("email")
						.toString();
				
				System.out.println(emailId);
			}
			
		}
}
