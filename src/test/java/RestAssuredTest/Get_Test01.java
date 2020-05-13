package RestAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;
// By adding static and all class by adding * after  Restassured import
// we can directly call the get by given, then without using RestAssured.get 
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class Get_Test01 {

	@Test
	public void getCall() {
		Response response = get("https://jsonplaceholder.typicode.com/posts/1");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		
		int code = response.getStatusCode();
		System.out.println("The status code is: " +code);
		System.out.println(response.getContentType());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		Assert.assertEquals(code, 200);
	}
	
	@Test(priority = 2)
	public void getCall2() {
		given().get("https://jsonplaceholder.typicode.com/posts/2").then()
		.statusCode(200);
	}
}
