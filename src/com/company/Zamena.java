package com.company;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//        числом. Подсчитать количество замен.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zamena {
    int n;
    int count=0;
    double array[];
    double z;

    public int getCount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n = sc.nextInt();
        array = new double[n];
//        Random random = new Random();
        for(int i=0;i<array.length;i++){
            array[i]=Math.random()*200-100;
            System.out.print(array[i]+"|");
        }

//        for(double i : array){
//            i=random.nextDouble();
//            System.out.print(i+"|");
//        }

        System.out.println('\n'+"Введите число Z: ");
        z=sc.nextDouble();


//        for(double i : array){
//            if (i>z){
//                i=z;
//                count++;
//            }
//        }

        for(int i=0;i< array.length;i++){
            if (array[i]>z){
                array[i]=z;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество замен: "+count);
        return count;
    }
}
