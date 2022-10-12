package org.acme;

import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.restassured.RestAssured;

@QuarkusIntegrationTest
public class ResourceIT {

    @Test
    public void testThisIsProperIT() {
        RestAssured.given().when().get("/hello/John").then().statusCode(200).body(is("Hello, John"));
    }
}