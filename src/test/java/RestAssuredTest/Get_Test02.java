package RestAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class Get_Test02 {
	
	@Test
	public void test01() {
		given().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200).body("data.id[5]", equalTo(12)).body("data.first_name", hasItems("George", "Rachel"))
		.log().all();
	}

}
