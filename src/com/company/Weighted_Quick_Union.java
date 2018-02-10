package com.company;

public class Weighted_Quick_Union implements Union_Find{
    private int[] arr;
    private int[] sz; //store the size of the roots
    private int indexTime = 0;
    private int[] max;
    private int root;

    public Weighted_Quick_Union(int n) {
        arr = new int[n];
        sz = new int[n];
        max = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.arraycopy(arr,0,max,0,arr.length);
    }

    private int root (int i) {
        // i is a root if arr[i] == i
        while (i != arr[i]) {
            i = arr[i];
        }
        return i;
    }

    /**
     * Implementing Path Compression
     * @param i
     * @return
     */
    private int rootPathCompression(int i) {
        int temp = i;
        while(i != arr[i]) {
            arr[i] = arr[arr[i]];
            i = arr[i];
        }
        arr[temp] = i;
        return i;
    }


    @Override
    public boolean connected(int p, int q) {
//        return root(p) == root(q);
        return rootPathCompression(p) == rootPathCompression(q);
    }

    @Override
    public void union(int p, int q) {
//        int a = root(p);
//        int b = root(q);
        int a = rootPathCompression(p);
        int b = rootPathCompression(q);

        if(sz[a] >= sz[b]) {
            arr[b] = a;
            sz[a] += 1;
            //sz[a] += sz[b];
            setMax(p,q);
        }else {
            arr[a] = b;
            sz[b] += 1;
            //sz[b] += sz[a];
            setMax(p,q);
        }
        indexTime ++;
    }

    @Override
    public boolean check_Value_Size(int n) {
        return (n > arr.length);
    }

    public void toStringArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.valueOf(arr[i])+" ");

        }
        System.out.println("Earliest time of all objects are connected at index: "+indexTime+"\n");
    }

    private void setMax(int p, int q) {
        if(max[p] > max[q]) {
            root = rootPathCompression(p);
            if(max[root] < max[p])
                max[root] = max[p];
        }else {
            root = rootPathCompression(q);
            if(max[root] < max[q])
                max[root] = max[q];
        }
    }

    public int find(int i) {
        int index = rootPathCompression(i);
        return max[index];
    }

    public int[] getArr() {
        return arr;
    }
}
