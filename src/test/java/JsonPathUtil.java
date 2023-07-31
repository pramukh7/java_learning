import io.restassured.path.json.JsonPath;

public class JsonPathUtil {
	public static JsonPath getJson(String json)
	{
		JsonPath jsonPath = new JsonPath(json);
		return jsonPath;
	}

}
