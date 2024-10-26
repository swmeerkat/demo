package com.example.demo.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

// to reuse the context for all IT
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class BaseIT {
    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    Integer port;
}

