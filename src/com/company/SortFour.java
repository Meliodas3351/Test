package com.company;

//Сортировка обменами. Дана последовательность чисел
//        a1  a2  an
//        .Требуется переставить числа в
//        порядке возрастания. Для этого сравниваются два соседних числа
//        i i+1 a и a
//        . Если
//        ai  ai+1
//        , то делается
//        перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//        Составить алгоритм сортировки, подсчитывая при этом количества перестановок.


import java.util.Arrays;
import java.util.Scanner;

public class SortFour {
    int a[];
    int n, temp;


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
        boolean sort=true;
        while (sort){
            sort=false;
            for(int i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    count++;
                    sort=true;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }
}