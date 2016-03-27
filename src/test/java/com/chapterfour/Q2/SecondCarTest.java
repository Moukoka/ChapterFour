package com.chapterfour.Q2;

import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/03/26.
 */
public class SecondCarTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testPrintdetails() throws Exception {
        Car c = new Car();
        assertEquals("Car is a BMW of speed 350",c.printdetails());
    }
}