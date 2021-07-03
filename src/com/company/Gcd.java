package com.company;
//. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:


import java.util.Scanner;

public class Gcd {


    public int getGcd(int a, int b){

            if (b==0) {
                System.out.println(a);
                return a;
            }
            else
                return getGcd(b,a%b);
    }

    public int getNok(int a, int b){
        return a*b/getGcd(a,b);
    }
}