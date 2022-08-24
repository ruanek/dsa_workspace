package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void convertFromBinaryPositive() {
        String[] binaryStr = {"1", "10", "110", "1110", "11110"};
        int[] expected = {1, 2, 6, 14, 30};
        for (int num=0; num<expected.length; num++) {
            int actual = BinaryConvert.convertFromBinary(binaryStr[num]);
            assertEquals(expected[num], actual);
            assertEquals(expected[num], actual);
        }
    }

    @Test
    public void convertFromOctalPositive() {
        String[] octalStr = {"7", "10", "321", "4321", "54321"};
        int[] expected = {7, 8, 209, 2257, 22737};
        for (int num=0; num<expected.length; num++){
            int actual = BinaryConvert.convertFromOctal(octalStr[num]);
            assertEquals(expected[num], actual);
        }
    }

    @Test
    public void convertFromOctalNegativeBadString() {
        String badOctalStr = "v";
        int actual = 0;
        try {
            actual = BinaryConvert.convertFromOctal(badOctalStr);
            fail("Didn't throw exception");
        } catch (InvalidParameterException ipe) {
            assertEquals(badOctalStr, ipe.getMessage());
        }
    }

    @Test
    public void convertFromBinaryNegativeBadString() {
        String badOctalStr = "v";
        int actual = 0;
        try {
            actual = BinaryConvert.convertFromOctal(badOctalStr);
            fail("Didn't throw exception");
        } catch (InvalidParameterException ipe) {
            assertEquals(badOctalStr, ipe.getMessage());
        }
    }

    @Test
    public void convertFromBinaryIntOverflowNegative() {
        String badBinaryStr = "10000000000000000000000000000000";
        int actual = 0;
        try {
            actual = BinaryConvert.convertFromBinary(badBinaryStr);
            fail("Didn't throw exception");
        } catch (InvalidParameterException ipe) {
            assertEquals("Overflow: " + badBinaryStr, ipe.getMessage());
        }
    }

    @Test
    public void convertFromOctalIntOverflowNegative() {
        String badOctalStr = "20000000000";
        int actual = 0;
        try {
            actual = BinaryConvert.convertFromOctal(badOctalStr);
            fail("Didn't throw exception");
        } catch (InvalidParameterException ipe) {
            assertEquals("Overflow: " + badOctalStr, ipe.getMessage());
        }
    }
}