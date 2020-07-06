package RestAsuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.testng.Assert.assertEquals;
import static io.restassured.matcher.ResponseAwareMatcher.*;


import org.hamcrest.core.Is;

public class Demo_GetRequest {
	@Test
	public void getWeather() {
		
		given().when().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").then().statusCode(200)
		.header("Content-Type","application/json");
		
	}

}
