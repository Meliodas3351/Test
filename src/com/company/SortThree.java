package com.company;

//Сортировка выбором. Дана последовательность чисел
//        a1  a2  an
//        .Требуется переставить элементы так,
//        чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//        элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//        повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;
import java.util.Scanner;

public class SortThree {
    int a[];
    int n,max,temp;


    public void getSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("The one массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random()*11);
            System.out.print(a[i] + "|");
        }
        System.out.println('\n');
        int count=0;

        for(int i=0;i<n;i++){           //СОРТИРОВКА ВЫБОРОМ
            int min = i;
            for(int j=i;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }if(a[min]<a[i]) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Количество замен: "+count);
    }
}