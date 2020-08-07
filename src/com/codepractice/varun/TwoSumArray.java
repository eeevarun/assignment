package com.codepractice.varun;

public class TwoSumArray {

    public static void main(String[] args) {
        // write your code here
        int total = 4;
        int[] a = new int[]{1,2,6,7,3};
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i+1; j <= a.length - 1; j++) {
//                //int sum = a[i] + a[j];
//                System.out.println("Number are :" + a[i] );
//                System.out.println("Number are :" + a[j] );
                if (total == a[i] + a[j]) {
                    System.out.println("Number which give total 4 are :" + a[i] +" and " + a[j]);
                    //System.out.println("Number are :" + a[j] );
                    break;
                }

            }
            //System.out.println(a);

        }
    }
}