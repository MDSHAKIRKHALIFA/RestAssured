package RestAssuredTest;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class Post_Test01 {
	
	@Test
	public void post01() {
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("Job", "QA Engineer");
//		map.put("Name", "Md Shakir");
//		System.out.println(map);

		//if you create Json object then you do not need to use map
		//Just add Json dependency and create an object veritable for JsonObject
		/**You can add any JsonJSON libraries from down below
		 * gson
		 * json
		 * jackson
		 * Simple json
         */
		
		JSONObject request = new JSONObject();
		request.put("Name", "Md Shakir");
		request.put("Job", "QA Engineer");
		System.out.println(request);
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
			when().
		post("https://reqres.in/api/users").
			then().statusCode(201);
	}

}
