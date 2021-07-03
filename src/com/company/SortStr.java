package com.company;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов


import java.util.Arrays;
import java.util.Scanner;

public class SortStr {
    int matrix[][];
    int n,m,min;

    public void getRes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк ");
        n=sc.nextInt();
        System.out.println("Введите число столбцов ");
        m=sc.nextInt();
        matrix=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=(int)(Math.random()*20+0);
                System.out.print(matrix[i][j]+" \t");
            }
            System.out.println();
        }
        System.out.println("=====================");
        for(int i=0;i<n;i++){
            int [] arr = new int[m];
            for(int j=0;j<m;j++){
                arr[j]=matrix[i][j];
            }
            Arrays.sort(arr);
            for(int k=0;k<m;k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }

    public void getResStolb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк ");
        n=sc.nextInt();
        System.out.println("Введите число столбцов ");
        m=sc.nextInt();
        matrix=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=(int)(Math.random()*20+0);
                System.out.print(matrix[i][j]+" \t");
            }
            System.out.println();
        }
        System.out.println("=====================");

        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                for(int k=0;k<n-1;k++){
                    for(int p=0;p<m;p++){
                        if(matrix[k][p]>=matrix[k+1][p]){
                            int temp;
                            temp=matrix[k][p];
                            matrix[k][p]=matrix[k+1][p];
                            matrix[k+1][p]=temp;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" \t");
            }
            System.out.println();
        }
    }
}