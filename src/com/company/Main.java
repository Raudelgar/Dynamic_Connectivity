package com.company;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Successor_Delete sd = new Successor_Delete(10);
        System.out.print("The array origin: \n");
        sd.toStringArr();
        System.out.println();

        sd.removeValue(6);
        System.out.print("After remove 6:\n");
        sd.toStringArr();
        System.out.println();

        System.out.print("The successor of 5 is: "+sd.findSuccessor(5));



//        //Weighted Quick Union Example
//        int count = 0;
//        int p = 0;
//        int q = 0;
//        PathCompresion_Quick_Union pcqu;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter N value: ");
//        int N = sc.nextInt();
//        System.out.print("N value is: "+N+"\n");
//        Weighted_Quick_Union wqu = new Weighted_Quick_Union(N);
//
//        int c = 7;
//        while (c > 0) {
//            outloop: {
//                if (count == 0) {
//                    System.out.print("Enter first value: ");
//                    p = sc.nextInt();
//                    if (wqu.check_Value_Size(p))
//                        break outloop;
//                    System.out.print("First value is: "+p+"\n");
//                    count ++;
//                }
//                if (count == 1) {
//                    System.out.print("Enter second value: ");
//                    q = sc.nextInt();
//                    if (wqu.check_Value_Size(q))
//                        break outloop;
//                    System.out.print("Second value is: "+q+"\n");
//                    count ++;
//                }
//                if (!wqu.connected(p, q)) {
//                    wqu.union(p,q);
//                    //if p and q have the same depth size, q gets p root
//                    System.out.print("union("+p+", "+q+")\n");
//                }
//            }
//
//
//            c --;
//            count = 0;
//        }
//
//        wqu.toStringArr();
//
//        int[] test = {4,3,8,9,5,6,0,1,2,7};
//
//        for (int i = 0; i < test.length; i++) {
//            System.out.print("Testing largest: Input => "+test[i]+" and the max value is: "+wqu.find(test[i])+"\n");
//        }

        //Quick Union Example
//        int count = 0;
//        int p = 0;
//        int q = 0;
//        PathCompresion_Quick_Union pcqu;
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter N value: ");
//        int N = sc.nextInt();
//        System.out.print("N value is: "+N+"\n");
//        Quick_Union qu = new Quick_Union(N);
//
//        while (N >= 0) {
//            outloop: {
//                if (count == 0) {
//                    System.out.print("Enter first value: ");
//                    p = sc.nextInt();
//                    if (qu.check_Value_Size(p))
//                        break outloop;
//                    System.out.print("First value is: "+p+"\n");
//                    count ++;
//                }
//                if (count == 1) {
//                    System.out.print("Enter second value: ");
//                    q = sc.nextInt();
//                    if (qu.check_Value_Size(q))
//                        break outloop;
//                    System.out.print("Second value is: "+q+"\n");
//                    count ++;
//                }
//                if (!qu.connected(p, q)) {
//                    qu.union(p,q);
//                    System.out.print("union("+p+", "+q+")\n");
//                }
//            }
//
//
//            N --;
//            count = 0;
//        }
//
//        qu.toStringArr();
//
//          //Improve Quick Union with Path Compression
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Do you want apply Path Compress(Y/N): ");
//        String answer = scan.nextLine();
//
//        if(!answer.equalsIgnoreCase("Y")) {
//            System.exit(1);
//        }
//
//        System.out.print("How many nodes wants to test: ");
//        int node = scan.nextInt();
//
//        pcqu = new PathCompresion_Quick_Union();
//
//        while (node >= 0) {
//            System.out.print("Enter node number: ");
//            int n = scan.nextInt();
//            pcqu.rootPathCompress(n,qu.getArr());
//
//            node --;
//        }
//
//        qu.toStringArr();


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
