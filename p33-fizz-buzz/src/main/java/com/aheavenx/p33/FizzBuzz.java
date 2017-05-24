package com.aheavenx.p33;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Skovorodnikov
 *         Created on 24.05.2017 11:16
 */
public class FizzBuzz {

    public Stream<String> play(final int startSequence, final int endSequence, final char separator) {
        Stream.Builder<String> builder = Stream.builder();
        int fizz, buzz;
        for (int i = startSequence; i <= endSequence; i++) {
            StringBuilder result = new StringBuilder();
            fizz = i % 3;
            buzz = i % 5;
            if (fizz == 0) result.append("Fizz");
            if (buzz == 0) result.append("Buzz");
            if ((fizz > 0) && (buzz > 0)) result.append(i);
            builder.add(result.append(separator).toString());
        }
        return builder.build();
    }

    public static void main(String[] args) {
        new FizzBuzz().play(1, 100, '\n').forEach(System.out::print);
    }
}
