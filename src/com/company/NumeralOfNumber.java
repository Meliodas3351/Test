package com.company;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр


import java.util.Scanner;

public class NumeralOfNumber {
    int a,b,countA, countB;
    public int count(int x){
        int count=0;
        while (x!=0){
            x/=10;
            count++;
        }
        return count;
    }

    public void getRes(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number A: ");
        a=sc.nextInt();
        System.out.println("Enter Number B: ");
        b=sc.nextInt();
        if(count(a)>count(b)){
            System.out.println("В числе "+a+" больше цифр");
        }else if(count(a)<count(b)){
            System.out.println("В числе "+b+" больше цифр");
        }else System.out.println("В обоих числах одинаковое количество цифр");
    }
}
