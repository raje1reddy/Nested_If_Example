package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;

public class NestedIfExampleTest {

    //@Test
    public static void main(String args[]){
        //NestedIfExample b1 = new NestedIfExample();
        int score = 110;
        if(score>200)
            if(score<400)
                if(score>300)
                    System.out.println(1);
                else
                    System.out.println(2);
                else
                    System.out.println(3);
        System.out.println(6);
int bill = 2000;
int qty=10;
int discount = (bill > 1000)?(qty >11)?10 : 9 : 5;
System.out.println(discount);


    }
}