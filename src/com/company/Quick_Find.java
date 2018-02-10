package com.company;

public class Quick_Find implements Union_Find{
    private int[] id;

    public Quick_Find (int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        if(id[p] == id[q])
            return true;
        return false;
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    @Override
    public boolean check_Value_Size(int n) {
        if (n > id.length)
            return true;
        return false;
    }

    public void toStringArr() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(String.valueOf(id[i])+" ");
        }
        System.out.println();
    }


}
