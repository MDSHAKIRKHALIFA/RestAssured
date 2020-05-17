package Personal_Database_LocalHost;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Get_Test {
	
	@Test(priority = 1)
	public void get_Test() {
		given().get("http://localhost:3000/users/2").then()
		.statusCode(200).log().all();
	}

}
