package com.company;

//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N


import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfNumber {
    long [] arr;
    long n,m;
    int size=0;

    public void getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N: ");
        n=sc.nextInt();
        m=n;
        while (m>10){
            m/=10;
            size++;
        }
        size+=1;
        System.out.println(size);
        arr = new long [size];
        for(int i=size-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
        }
        System.out.println(Arrays.toString(arr));
    }
}