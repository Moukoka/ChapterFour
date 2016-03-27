package com.chapterfour.DIP;

import junit.framework.TestCase;

/**
 * Created by Rosie on 2016/03/26.
 */
public class ManagerTest extends TestCase {

    public void testManage() throws Exception {
        Manager m = new Manager();
        assertEquals("Accountant",m.worker);
    }
}