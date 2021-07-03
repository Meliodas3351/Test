package com.company;

//Пусть даны две неубывающие последовательности действительных чисел
//a1  a2  an и b1  b2  bm
//.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1  b2  bm
//в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.Arrays;
import java.util.Scanner;

public class SortSeven {
    int a[];
    int n,m;
    int b[];
    int res[];

    public void getSort() {

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        System.out.println("m=");
        m = sc.nextInt();
        a = new int[n + m];
        b = new int[m];
        res=new int[2*n+1];
        System.out.println("The one массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = i+3;
            System.out.print(a[i] + "|");
        }
        System.out.println('\n');

        System.out.println("The two массив: ");
        for (int i = 0; i < m; i++) {
            b[i] = i*2;
            System.out.print(b[i] + "|");
        }
        System.out.println('\n');

            for(int j=0;j<m;j++){
                for(int i=0;i<n;i++){
                    if(b[j]<=a[i]){

                    }
                }
            }
        System.out.println(Arrays.toString(res));
    }
}