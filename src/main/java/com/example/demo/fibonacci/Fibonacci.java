package com.example.demo.fibonacci;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Fibonacci {

  private static final int MAX_LENGTH = 50;

  public FibonacciResult getSequence(final int length) {
    FibonacciResult fr = new FibonacciResult();
    if (length > MAX_LENGTH) {
      fr.setMsg("Error: length is > " + MAX_LENGTH + ". Sequence wasn't calculated");
      return fr;
    }
    switch (length) {
      case -1:
        fr.setMsg("Error: sequence length is < 0");
        break;
      case 0:
        fr.setMsg("Warning: sequence length is 0");
        break;
      default:
        calculateSequence(fr, length);
    }
    log.debug("sequence: {}", Arrays.toString(fr.getSequence()));
    log.debug("msg: {}", fr.getMsg());
    return fr;
  }

  private void calculateSequence(final FibonacciResult fr, final int length) {
    long[] sequence = new long[length];
    sequence[0] = 0;
    if (length > 1) {
      sequence[1] = 1;
    }
    for (int i = 2; i < length; i++) {
      sequence[i] = sequence[i - 2] + sequence[i - 1];
    }
    fr.setSequence(sequence);
  }
}
