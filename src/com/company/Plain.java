package com.company;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.


import java.util.Scanner;

public class Plain {

    int n;
    double [] array;
    double sum=0;
    boolean b=true;

    public void getSum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        n=sc.nextInt();
        array = new double[n];

        System.out.println("Исходный массив: ");
        for(int i=0;i<array.length;i++){                //вывод массива
            array[i]=Math.random()*(20)-10;                      //рандом от [-100;100]от-100 .200+1 чисел
            System.out.print(array[i]+"|");
        }
        System.out.println('\n');

        for(int i=2;i<array.length;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    b=false;
                    break;
                }
            }
            if(b) {
                sum+=array[i];

            }
            else b=true;
        }
        System.out.println(sum);
    }
}
