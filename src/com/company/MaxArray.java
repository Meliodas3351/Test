package com.company;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).


import java.util.Scanner;

public class MaxArray {
    int n,max1, max2;
    int [] arr;


    public void getRes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n=sc.nextInt();
        arr=new int[n];
        max1 = 0;
        max2 = 0;
        for(int i:arr){
            i=(int)(Math.random()*31);
            if(i>max2){
                max1=max2;
                max2=i;
            }else{
                if(i>max1){
                    max1=i;
                }
            }
            System.out.print(i+"\t");
        }
        System.out.println();

        System.out.println(max1);
        System.out.println(max2);
    }
}
