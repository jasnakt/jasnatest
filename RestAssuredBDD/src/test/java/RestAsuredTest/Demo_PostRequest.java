package RestAsuredTest;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;

public class Demo_PostRequest {
	
	HashMap map=new HashMap();
	
	@BeforeTest
	public void getPostData() {
		
		map.put("name","morpheus");
		map.put("job", "zion resident");
		
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users";
		
	}
	
	@Test
	public void testPost() {
		
		given()
		.contentType("application/json").body(map)
		.when()
		.post()
		
		.then().statusCode(201);
		
		
	}

}
