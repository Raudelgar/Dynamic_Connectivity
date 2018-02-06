package com.company;

import java.util.*;

public class Union_Find {
    private int n;
    private Map<String, List<Integer>> arrList = new HashMap<>();


    public Union_Find(int n) {
        this.n = n;
    }

    public boolean connected(int p, int q) {
        //check if p and q are in the same array
        //first time would be false, so the union method will be executed
        return false;
    }

    public void union (int p, int q) {
        //create a new array adding both arguments into it
        int[] arr1 = new int[2];
        arr1[0] = p;
        arr1[1] = q;
    }

}
