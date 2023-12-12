package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldReturnData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));
        ;
    }
}
