package com.company;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N

import java.util.Arrays;
import java.util.Scanner;

public class NewArray {

    int k,n,sum;
    int arr[]=new int [50];

    public int SumOfNumeral(int x){
        sum=0;//сумма цифр числа массива
            while(x!=0){
                sum += (x % 10);
                x/=10;
            }
//        System.out.println(sum);
        return sum;
    }


     public void getRes(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Number K: ");
         k=sc.nextInt();
         System.out.println("Enter Number N: ");
         n=sc.nextInt();

         int p=0;
         int count = 0;
         for(int i=0;i<=n;i++){             //перебор последовательных натуральных чисел
             if(SumOfNumeral(i)==k){
                 System.out.print(i+"\t");
                 count++;
                 arr[p]=i;                  //временный массив
                 p++;
             }
         }
         int [] arr2=new int[count];        //итоговый массив
         for(int j=0;j<count;j++){
             arr2[j]=arr[j];
         }
         System.out.println();
         System.out.println(Arrays.toString(arr2));
    }
}