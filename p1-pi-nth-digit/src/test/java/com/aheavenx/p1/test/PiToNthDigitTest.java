package com.aheavenx.p1.test;

import com.aheavenx.p1.PiNthDigit;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Skovorodnikov
 *         Created on 17.05.2017 14:26
 */
public class PiToNthDigitTest {

    private PiNthDigit worker = new PiNthDigit();

    @Test
    public void testPiGenerationSuccess() {
        assertTrue(worker.piUpToDigit((short)1) > 3.0);
        assertTrue(worker.piUpToDigit((short)2) > 3.1);
        assertTrue(worker.piUpToDigit((short)3) > 3.14);
        assertTrue(worker.piUpToDigit((short)4) > 3.141);
        assertTrue(worker.piUpToDigit((short)5) > 3.1415);
        assertTrue(worker.piUpToDigit((short)6) > 3.14159);
        assertTrue(worker.piUpToDigit((short)7) > 3.141592);
        assertTrue(worker.piUpToDigit((short)8) > 3.1415921);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPiGenerationInvalid() {
        worker.piUpToDigit(Short.MIN_VALUE);
    }
}
