package com.example.demo.integration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

// to use one context for all IT
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class BaseIT {

  @LocalServerPort
  Integer port;
}

