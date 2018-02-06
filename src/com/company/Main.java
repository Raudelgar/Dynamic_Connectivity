package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N = 0;
        int p = 0;
        int q = 0;
        int count = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        N = sc.nextInt();
        while(count > 0) {
            System.out.println("Enter a number: ");
            p = sc.nextInt();
            q = sc.nextInt();
            count --;
        }
        System.out.println(N+" "+p+" "+q);
    }


}
