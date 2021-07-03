package com.company;

//Даны дроби
//n
//n
//q
//p
//q
//p
//q
//p
//, , ,
//2
//2
//1
//1 
//(
//pi qi
//, - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.


import java.util.Arrays;
import java.util.Scanner;

public class SortEight {
    int[] a;
    int[] b;
    int denominator = 1,n;


    public void getSort() {

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        System.out.println("The one массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random()*11);
            System.out.print(a[i] + "|");
        }
        System.out.println('\n');

        System.out.println("The two массив: ");
        for (int i = 0; i < n; i++) {
            b[i] = (int)(Math.random()*11);
            System.out.print(b[i] + "|");
        }
        System.out.println('\n');

        for(int i=0;i<n;i++) {
            denominator *= b[i];
        }
            for(int j=0;j<n;j++){
                a[j]*=denominator/b[j];
                b[j]=denominator;
            }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}