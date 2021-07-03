package com.company;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

import java.util.Scanner;

public class Diagonal {
    int matrix[][];
    int n;

    public void getLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы n:");
        n=sc.nextInt();
        matrix = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix [i][j]=(int)(Math.random()*10);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i++){                                   //вывод диагональных чисел
            for(int j=0;j<n;j++){
                if(j==i){
                    System.out.print(matrix[i][j]+"\t");
                }
            }
        }
    }
}
