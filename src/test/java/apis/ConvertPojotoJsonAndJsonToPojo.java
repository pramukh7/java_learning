package apis;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertPojotoJsonAndJsonToPojo {

	@Test
	public void convertPojoToJson() throws JsonProcessingException {
		User user = new User();
		user.setName("Vaishali");
		user.setJob("IT specialist");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		System.out.println(json);
	}
	
	@Test
	public void convertJsonToPojo() throws JsonProcessingException {

		String json = "{\r\n" + 
				"\"name\":\"Akshar\",\r\n" + 
				"\"job\":\"Sadhu\"\r\n" + 
				"}";
		
		ObjectMapper objectMapper = new ObjectMapper();
		User user = objectMapper.readValue(json, User.class);
		System.out.println(user.getName());
		System.out.println(user.getJob());
	}
	
}
