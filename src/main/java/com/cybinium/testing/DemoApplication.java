package com.cybinium.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
 
import static io.restassured.RestAssured.*;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Before
	public void init() {
			RestAssured.baseURI = "http://localhost";
			RestAssured.basePath = "/student";
			RestAssured.port = 8080;
	}

	@Test
	public void getListStudent() {
			Response res = given()
							.when()
							.get("/list");

			res.prettyPrint();
			res.then().statusCode(200);
			

	}


}
