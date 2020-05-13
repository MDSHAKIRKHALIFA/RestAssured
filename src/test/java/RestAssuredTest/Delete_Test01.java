package RestAssuredTest;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class Delete_Test01 {
	
	@Test
	public void Delete01() {
		when().
			delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();
	}
}