package com.company;

import java.util.*;

public class Union_Find {
    private int n;
    private String name;
    private Map<String, int[]> arrList = new HashMap<>();


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
    }


    public void createList (int n) {
        name = "list"+n;
        arrList.put(name,new int[1]);
    }

    public void createListUnion () {
        name = "listUnion"+n;
        arrList.put(name,new int[1]);
    }

    public void findArr(int m) {
        for (Map.Entry<String,int[]> e : arrList.entrySet()) {
            if (e.getKey().contains(Integer.toString(m))) {
                e.getValue()[0] = m;
            }
        }
    }


    public void toStringMap() {
        for (Map.Entry<String, int[]> e : arrList.entrySet()) {
            int[] a = e.getValue();
            for (int i = 0; i < a.length; i++) {
                System.out.println(String.valueOf(a[i]));
            }
        }
    }

}
