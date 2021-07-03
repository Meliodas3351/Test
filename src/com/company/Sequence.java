package com.company;

//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.


import java.util.Scanner;

public class Sequence {
    int [] d;
    int k,m,n,sum;

    public void getSequence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        d = new int[n];
        System.out.println("массив: ");
        for (int i = 0; i < n; i++) {
            d[i] = (int) (Math.random() * 11);
            System.out.print(d[i] + "|");
        }
        System.out.println('\n');

        do{
            System.out.println("k=");
            k = sc.nextInt();
            System.out.println("m=");
            m = sc.nextInt();
        }while((k>m)||((m-k)<=2)||(k<=0)||(k>n)||(m>n));

        for(int i=k+1;i<=m-1;i++){
                sum=d[i-1]+d[i]+d[i+1];
            System.out.println(d[i-1]+"+"+d[i]+"+"+d[i+1]+"="+sum);
        }
    }
}