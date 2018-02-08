package com.company;

import java.util.Map;

public class Quick_Find {
    private int[] id;

    public Quick_Find (int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        if(id[p] == id[q])
            return true;
        return false;
    }

    public void union (int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public void toStringArr() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(String.valueOf(id[i])+" ");
        }
    }
}
