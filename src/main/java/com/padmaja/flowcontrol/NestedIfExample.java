package com.padmaja.flowcontrol;
import java.lang.String;

public class NestedIfExample {
    public int getRankBaseOfScore(int score) {
        if(score>200)
            if(score<400)
                if(score>300)
                    return 1;
                else
                    return (2);
            else
                return (3);
        return(6);

    }

    public int getDiscount(int bill, int qty) {
        int discount = (bill > 1000)?(qty >11)?10 : 9 : 5;
        return discount;
    }
}