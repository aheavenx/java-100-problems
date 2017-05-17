package com.aheavenx.p1.test;

import com.aheavenx.p1.PiNthDigit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author Skovorodnikov
 *         Created on 17.05.2017 14:26
 */
@RunWith(Parameterized.class)
public class PiToNthDigitTest {

    private PiNthDigit worker = new PiNthDigit();
    private short digit;
    private double piExpected;

    public PiToNthDigitTest(short digit, double piExpected) {
        this.digit = digit;
        this.piExpected = piExpected;
    }

    @Parameterized.Parameters(name = "{index}: piUpToDigit({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {(short)1, 3.1},
                {(short)2, 3.14},
                {(short)3, 3.141},
                {(short)4, 3.1415},
                {(short)5, 3.14159},
                {(short)6, 3.141592},
                {(short)7, 3.1415921}
        });
    }
    @Test
    public void testPiGenerationSuccess() {
        double piActual = worker.piUpToDigit(digit);
        assertTrue(piActual >= piExpected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPiGenerationInvalid() {
        worker.piUpToDigit(Short.MIN_VALUE);
    }
}
