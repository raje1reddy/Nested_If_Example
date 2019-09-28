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

    @Test
    public void testGetRankBaseOfScore250() {
        NestedIfExample nestedIfExample = new NestedIfExample();
        int result = nestedIfExample.getRankBaseOfScore(250);
        System.out.println(result);
        int expectedresult = 2;
        assertEquals(expectedresult,result);
    }
    @Test
    public void testGetRankBaseOfScore350() {
        NestedIfExample nestedIfExample = new NestedIfExample();
        int result = nestedIfExample.getRankBaseOfScore(350);
        System.out.println(result);
        int expectedresult = 1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore450() {
        NestedIfExample nestedIfExample = new NestedIfExample();
        int result = nestedIfExample.getRankBaseOfScore(450);
        System.out.println(result);
        int expectedresult = 3;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetDiscount1() {
        NestedIfExample nestedIfExample = new NestedIfExample();
        int result = nestedIfExample.getDiscount(5000,60);
        System.out.println(result);
        int expectedresult = 10;
        assertEquals(expectedresult,result);
    }
}