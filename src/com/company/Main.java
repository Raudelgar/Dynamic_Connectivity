package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Quick Union Example
        int count = 0;
        int p = 0;
        int q = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int N = sc.nextInt();
        System.out.print("N value is: "+N+"\n");
        Quick_Union qu = new Quick_Union(N);

        while (N >= 0) {
            outloop: {
                if (count == 0) {
                    System.out.print("Enter first value: ");
                    p = sc.nextInt();
                    if (qu.check_Value_Size(p))
                        break outloop;
                    System.out.print("First value is: "+p+"\n");
                    count ++;
                }
                if (count == 1) {
                    System.out.print("Enter second value: ");
                    q = sc.nextInt();
                    if (qu.check_Value_Size(q))
                        break outloop;
                    System.out.print("Second value is: "+q+"\n");
                    count ++;
                }
                if (!qu.connected(p, q)) {
                    qu.union(p,q);
                    System.out.print("union("+p+", "+q+")\n");
                }
            }


            N --;
            count = 0;
        }

        qu.toStringArr();


        //Quick Find Example
//        int count = 0;
//        int p = 0;
//        int q = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter N value: ");
//        int N = sc.nextInt();
//        System.out.println("N value is: "+N);
//        Quick_Find qf = new Quick_Find(N);
//
//        while (N >= 0) {
//            outloop: {
//                if (count == 0) {
//                    System.out.println("Enter first value: ");
//                    p = sc.nextInt();
//                    if (qf.check_Value_Size(p))
//                        break outloop;
//                    System.out.println("First value is: "+p);
//                    count ++;
//                }if (count == 1) {
//                    System.out.println("Enter second value: ");
//                    q = sc.nextInt();
//                    if (qf.check_Value_Size(q))
//                        break outloop;
//                    System.out.println("Second value is: "+q);
//                    count ++;
//                }
//                if (!qf.connected(p, q)) {
//                    qf.union(p,q);
//                    System.out.println(p+" "+q);
//                }
//            }
//
//
//            N --;
//            count = 0;
//        }
//
//        qf.toStringArr();


        //BinarySearch example
//        int [] arr = {0,3,5,6,7,8,9,12,15,24,30};
//        int key = 3;
//        System.out.println(BinarySearch.indexOf(arr,key));

        //Euclid example
//        System.out.println(Euclid.greatest_Common_Divisor(20,10));

    }


}
