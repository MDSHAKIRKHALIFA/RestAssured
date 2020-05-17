package Personal_Database_LocalHost;

import static io.restassured.RestAssured.when;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Delete_Test {
	
	@Test(priority = 1)
	public void delete() {
		when().
			delete("http://localhost:3000/users/2").
		then().statusCode(200);
	}
	
	@DataProvider (name="DataDelete")
	public Object[] dataDelete() {
		
		return new Object[] {
				1, 3
		};
	}
	
	@Test(priority = 1, dataProvider = "DataDelete")
	public void delete1(int userID) {
		
		when().
			delete("http://localhost:3000/users/"+userID).
		then().statusCode(200);
	}

}
