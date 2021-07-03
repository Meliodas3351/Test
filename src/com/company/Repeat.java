package com.company;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//         чисел несколько, то определить наименьшее из них


import java.util.Arrays;
import java.util.Scanner;

public class Repeat {
    int arr [];
    int n;
    int arrCount [];
    int temp,count;

    public void getRepeat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n=sc.nextInt();
        arr = new int[n];
        arrCount=new int[n];

        for(int i=0;i<arr.length;i++){                //ввод массива
            System.out.println("Введите a["+i+"]");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Отсортированный массив: "+Arrays.toString(arr));


        for (int j=0;j<n;j++){              //заполнение массива arrCount количеством чисел
            temp=arr[j];
            count=1;

            for(int i=0;i<n;i++){
                if(i!=j) {
                    if (arr[i] == temp) {
                        count++;

                    }
                }
            }
            arrCount[j]=count;
        }
        int max=arrCount[0];
        for(int i=0;i<n;i++){
            if(arrCount[i]>max){
                max=arrCount[i];
            }
        }

        System.out.println(Arrays.toString(arrCount));

    }
}