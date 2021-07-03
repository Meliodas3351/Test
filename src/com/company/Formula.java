package com.company;

//Дана последовательность целых чисел
//        a a an
//        , , ,
//        1 2 
//        . Образовать новую последовательность, выбросив из
//        исходной те члены, которые равны
//        min

import java.util.Arrays;
import java.util.Scanner;

public class Formula {
    int min ;
    int array [];
    int n;
    int count;


    public void getArr(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n=sc.nextInt();
        array = new int[n];

        System.out.println("Исходный массив: ");
        for(int i=0;i<array.length;i++){                //вывод массива
            array[i]=(int)(Math.random()*(30)-10);                      //рандом от [-10;10]от-100 .20 чисел
            System.out.print(array[i]+"|");
        }
        System.out.println('\n');

        min=array[0];

        for(int i=0;i<array.length;i++){                //поиск минимального элемента
            if(array[i]<min){
                count=1;
                min=array[i];
            }else if(array[i]==min)count++;
        }
        System.out.println("Количество минимальных элементов "+count);
        System.out.println("Минимальный элемент"+min);

        int array2[] = new int [n-count];
        int j=0;

        for(int i =0;i< array.length;i++){          //заполнение нового массива
            if(array[i]>min){
                array2[j++]=array[i];
            }

        }

        System.out.println(Arrays.toString(array2));
    }

}