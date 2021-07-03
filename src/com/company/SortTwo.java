package com.company;

//
//Даны две последовательности
//        a1  a2  an и b1  b2  bm
//        . Образовать из них новую последовательность
//        чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.


import java.util.Arrays;
import java.util.Scanner;

public class SortTwo {
    int a[];
    int n,m;
    int b[];

    public void getSort() {

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        System.out.println("m=");
        m = sc.nextInt();
        a = new int[n + m];
        b = new int[m];
        System.out.println("The one массив: ");
        for (int i = 0; i < n; i++) {
                a[i] = (int) (1+i);
                System.out.print(a[i] + "|");
        }
        System.out.println('\n');

        System.out.println("The two массив: ");
        for (int i = 0; i < m; i++) {
            b[i] = (int) (1+2*i);
            System.out.print(b[i] + "|");
        }
        System.out.println('\n');
        int p=0;
        for(int i =n;i<a.length;i++){
            a[i]=b[p];
            p++;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}