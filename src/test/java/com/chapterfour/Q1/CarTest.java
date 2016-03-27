package com.chapterfour.Q1;

import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/03/26.
 */
public class CarTest extends TestCase {

    public void testGetModel() throws Exception {
        Car m = new Car();
        m.setModel("Porsche");
        assertEquals("Porsche",m.getModel());
    }

    public void testPrintdetails() throws Exception {
        Car mycar = new Car(32,350,"Black","Porsche");
        mycar.printdetails();
    }
}