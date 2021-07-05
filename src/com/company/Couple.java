package com.company;

//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Couple {
    int n;

    public void difference(int x){
        for(int i=n;i<2*n-1;i++){
            System.out.println(i+"-"+(i+2));

        }
    }

    public void getCouple(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number n: ");
        n=sc.nextInt();
        difference(n);
    }

    public static void info(){
        System.out.println(Couple.class);
    }
}
