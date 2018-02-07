package com.company;

public class Euclid {


    public static int greatest_Common_Divisor(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return greatest_Common_Divisor(q,r);
    }
}
