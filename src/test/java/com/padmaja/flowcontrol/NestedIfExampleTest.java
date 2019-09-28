package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;


public class NestedIfExampleTest {

    @Test
    public void testGetRankBaseOfScore() {
        NestedIfExample nestedIfExample = new NestedIfExample();
        int result = nestedIfExample.getRankBaseOfScore(120);
        System.out.println(result);
        int expectedresult = 6;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetDiscount() {
        NestedIfExample nestedIfExample = new NestedIfExample();
        int result = nestedIfExample.getDiscount(5,6);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult,result);
    }
}