package com.company;

import java.util.Arrays;

public class Successor_Delete {
    private int arr[];

    public Successor_Delete(int n) {
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }

    public void removeValue(int x) {
        int[] temp = new int[arr.length -1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                continue;
            }
            temp[count] = arr[i];
            count ++;
        }
        arr = new int[temp.length];
        System.arraycopy(temp,0,arr,0,temp.length);
    }

    public int findSuccessor (int x) {
        int index = Arrays.binarySearch(arr,x);
        index ++;
        return arr[index];
    }

    public void toStringArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.valueOf(arr[i])+" ");

        }
    }

}
