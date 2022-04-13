package om.restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import org.junit.Test;

import io.restassured.*;

public class Get_Request {

	@Test
	public void getMethod() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification request = RestAssured.given();

		Response response = request.get("/api/users/2");

		String asString = response.asString();

		System.out.println(asString);

		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);

		Assert.assertEquals(200, statusCode);

	}

}
