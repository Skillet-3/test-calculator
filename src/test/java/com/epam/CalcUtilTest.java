package com.epam;


import org.junit.Test;

import static junit.framework.Assert.assertTrue;


public class CalcUtilTest {

    @Test
    public void testSum() throws Exception {
        assertTrue(CalcUtil.sum(2, 3) == 5);
    }

    @Test
    public void testSumByZero() throws Exception {
        assertTrue(CalcUtil.sum(2, 0) == 2);
    }

    @Test
     public void testMult() throws Exception {
        assertTrue(CalcUtil.mult(3, 4) == 12);
    }

    @Test
    public void testMultByZero() throws Exception {
        assertTrue(CalcUtil.mult(5, 0) == 0);
    }

    @Test
    public void testMaltByNegative() throws Exception {
        assertTrue(CalcUtil.mult(3, -5) == -15);
    }

    @Test
    public void testDiff() throws Exception {
        assertTrue(CalcUtil.diff(4, 5) == -1);
    }

    @Test
    public void testDiffByNegative() throws Exception {
        assertTrue(CalcUtil.diff(-5, 7) == -12);
    }

    @Test
    public void testDev() throws Exception {
        assertTrue(CalcUtil.dev(6, 3) == 2);
    }

    @Test
    public void testDevByNegative() throws Exception {
        assertTrue(CalcUtil.dev(10, -2) == -5);
    }

    @Test
    public void testDevByZero() throws Exception {
        assertTrue(CalcUtil.dev(8, 0) == 0);
    }
}