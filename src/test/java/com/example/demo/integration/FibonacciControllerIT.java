package com.example.demo.integration;

import com.example.demo.fibonacci.FibonacciResult;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FibonacciControllerIT extends BaseIT {

    @Test
    public void getFibonacciSequence() {
        ResponseEntity<FibonacciResult> response =
                this.restTemplate.getForEntity("http://localhost:" + port + "/fibonacci/0", FibonacciResult.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(Objects.requireNonNull(response.getBody()).getSequence());
        assertEquals(50, response.getBody().getSequence().length);
    }
}
