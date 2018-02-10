package com.company;

public class Weighted_Quick_Union implements Union_Find{
    private int[] arr;
    private int[] sz; //store the size of the roots

    public Weighted_Quick_Union(int n) {
        arr = new int[n];
        sz = new int[n];
        for(int i = 0; i < n; i++) {
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
        int a = root(p);
        int b = root(q);

        if(sz[a] >= sz[b]) {
            arr[b] = a;
            sz[a] += 1;
        }else {
            arr[a] = b;
            sz[b] += 1;
        }
    }

    @Override
    public boolean check_Value_Size(int n) {
        return (n > arr.length);
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
