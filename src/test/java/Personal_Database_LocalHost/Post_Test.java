package Personal_Database_LocalHost;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Post_Test {
	
	@Test(priority = 1)
	public void post_Test() {
		
		JSONObject request = new JSONObject();
		request.put("firstName", "Md");
		request.put("lastName", "Shakir");
		request.put("Job", "QA Engineer");
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
		header("Content-Type", "application/json").	
			body(request.toJSONString()).
		when().
			post("http://localhost:3000/users/").
		then().statusCode(201).
			log().all();
	}
	
	@Test(priority = 2)
	public void post_Test1() {
		
		JSONObject request = new JSONObject();
		request.put("firstName", "Shakir");
		request.put("lastName", "Murhat");
		request.put("Job", "QA Automation Engineer");
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
		header("Content-Type", "application/json").	
			body(request.toJSONString()).
		when().
			post("http://localhost:3000/users/").
		then().statusCode(201).
			log().all();
	}
	
	

}
