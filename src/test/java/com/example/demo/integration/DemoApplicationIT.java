package com.example.demo.integration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class DemoApplicationIT {

	@Test
	void contextLoads() {
	}

	@Test
	@Disabled
	void toBeIgnored() {
		// The world is bad. Everybody ignores me.
        fail();
	}

}
