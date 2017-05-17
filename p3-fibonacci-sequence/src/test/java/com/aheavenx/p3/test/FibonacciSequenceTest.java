package com.aheavenx.p3.test;

import com.aheavenx.p3.FibonacciSequence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Skovorodnikov
 *         Created on 17.05.2017 16:52
 */
@RunWith(Parameterized.class)
public class FibonacciSequenceTest {

    private FibonacciSequence worker = new FibonacciSequence();

    private long fibExpected;
    private int index;

    public FibonacciSequenceTest(long fibExpected, int index) {
        this.fibExpected = fibExpected;
        this.index = index;
    }

    @Parameterized.Parameters(name = "{index}: nthFibonacciNumber({1})={0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,         1},
                {1,         2},
                {2,         3},
                {3,         4},
                {5,         5},
                {55,        10},
                {102334155, 40}
        });
    }

    @Test
    public void testNthNumberSuccess() {
        long fibActual = worker.nthFibonacciNumber(index);
        assertThat(fibActual, is(equalTo(fibExpected)));
    }

    //todo illegalarg

}
