package com.company;

//Сформировать квадратную матрицу порядка N по правилу: a=sin(i2-j2)/n


import java.text.DecimalFormat;
import java.util.Scanner;

public class Sinus {
    double matrix[][];
    int n;
    int count=0;
    String res="";

    public void getSinus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы n:");
        n = sc.nextInt();
        matrix = new double[n][n];

        DecimalFormat decimalFormat = new DecimalFormat("#.#");


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=Math.sin((i*i-j*j)/n);
                res = decimalFormat.format(matrix[i][j]);
                System.out.print(res+"\t");
//                System.out.print(matrix[i][j]+"\t");
                if(matrix[i][j]>0) count++;
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов в матрице: "+count);

    }
}