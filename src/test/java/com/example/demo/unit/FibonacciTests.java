package com.example.demo.unit;

import com.example.demo.fibonacci.Fibonacci;
import com.example.demo.fibonacci.FibonacciResult;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTests {

  private static Stream<Arguments> checkFibonacciSequence() {
    return Stream.of(
        Arguments.of(-1, null, "Error: sequence length is < 0"),
        Arguments.of(51, null, "Error: length is > 50. Sequence wasn't calculated"),
        Arguments.of(0, null, "Warning: sequence length is 0"),
        Arguments.of(1, new long[]{0}, ""),
        Arguments.of(2, new long[]{0, 1}, ""),
        Arguments.of(3, new long[]{0, 1, 1}, ""),
        Arguments.of(9, new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21}, "")
    );
  }

  @ParameterizedTest
  @MethodSource
  void checkFibonacciSequence(int length, long[] expectedSeq, String expectedMsg) {
    Fibonacci fibo = new Fibonacci();
    FibonacciResult fr = fibo.getSequence(length);
    assertArrayEquals(expectedSeq, fr.getSequence(),
        "sequence is " + Arrays.toString(fr.getSequence()));
    assertEquals(fr.getMsg(), expectedMsg);
  }

}