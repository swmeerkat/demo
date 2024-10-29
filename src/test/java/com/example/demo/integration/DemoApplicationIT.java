package com.example.demo.integration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class DemoApplicationIT extends BaseIT {

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
