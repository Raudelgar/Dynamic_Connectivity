package com.company;

public class Quick_Union implements Union_Find {
    private int[] arr;

    public Quick_Union (int n) {
        arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = i;
        }
    }

    private int root (int i) {
        // i is a root if arr[i] == i
        while (i != arr[i]) {
            i = arr[i];
        }
        return i;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        arr[i] = j;
    }

    @Override
    public boolean check_Value_Size(int n) {
        if (n > arr.length)
            return true;
        return false;
    }

    public void toStringArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.valueOf(arr[i])+" ");

        }

        System.out.println();
    }

    public int[] getArr() {
        return arr;
    }
}
