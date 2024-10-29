package com.example.demo;

import com.example.demo.fibonacci.Fibonacci;
import com.example.demo.fibonacci.FibonacciResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

  private final Fibonacci fibonacci;

  public FibonacciController(final Fibonacci fibonacci) {
    this.fibonacci = fibonacci;
  }

  @GetMapping("/fibonacci/{length}")
  public FibonacciResult getFibonacciSequence(@PathVariable final int length) {
    return fibonacci.getSequence(length);
  }

}
