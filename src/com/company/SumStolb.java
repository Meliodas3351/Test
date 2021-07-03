package com.company;

//Задана матрица неотрицательных чисел.
// Посчитать сумму элементов в каждом столбце. Определить, какой толбец содержит максимальную сумму


import java.util.Arrays;
import java.util.Scanner;

public class SumStolb {
    int [] [] matrix;
    int n,m, sumCurrent,sumCurrent2,k;

    public void getRes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы n ");
        n=sc.nextInt();
        System.out.println("Введите размер матрицы m ");
        m=sc.nextInt();
        matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=(int)(Math.random()*10+0);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        int arr[]=new int[m];

        for(int j=0;j<m;j++){
            sumCurrent=0;
            for(int i=0;i<n;i++){
                sumCurrent+=matrix[i][j];
                sumCurrent2=sumCurrent;
            }
                arr[j] = sumCurrent;
        }
        int max=arr[0];
        int numberStolb=0;
        for(int j=0;j<m;j++){
            if(arr[j]>max){
                max=arr[j];
                numberStolb=j;
            }
        }
        System.out.println("Максимальная сумма в столбце номер "+(numberStolb+1));
        System.out.println('\n'+Arrays.toString(arr));
    }
}