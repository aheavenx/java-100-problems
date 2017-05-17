package com.aheavenx.p2.test;

import com.aheavenx.p2.EToNthDigit;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * @author Skovorodnikov
 *         Created on 17.05.2017 15:21
 */
@RunWith(Parameterized.class)
public class EToNthDigitTest {

    private EToNthDigit worker = new EToNthDigit();
    private short digit;
    private double eExpected;

    public EToNthDigitTest(short digit, double eExpected) {
        this.digit = digit;
        this.eExpected = eExpected;
    }

    @Parameterized.Parameters(name = "{index}: eUpToDigit({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {(short)1, 2.7},
                {(short)2, 2.71},
                {(short)3, 2.712},
                {(short)4, 2.7128},
                {(short)5, 2.71282}
        });
    }

    @Test
    public void testEGenerationSuccess() {
        double eActual = worker.eUpToDigit(digit);
        assertTrue(eActual >= eExpected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEGenerationIllegal() {
        worker.eUpToDigit(Short.MIN_VALUE);
    }
}
