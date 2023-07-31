import io.restassured.path.json.JsonPath;

public class demo2 {

	public static void main(String[] args)
	{
		JsonPath json = JsonPathUtil.getJson(Payloads.getMPayload());
		//System.out.println(json.get("data.address.city"));
	}
}
