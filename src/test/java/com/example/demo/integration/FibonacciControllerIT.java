package com.example.demo.integration;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class FibonacciControllerIT extends BaseIT {

    @Test
    public void getFibonacciSequenceRA() {
        when()
                .request("GET", "http://localhost:" + port + "/fibonacci/50")
                .then()
                .statusCode(200);
    }
}
