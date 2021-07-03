package com.company;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.


import java.util.Scanner;

public class Armstrong {
    int sum=0,k,n,tmp;
    int numbers [];


    public int sum(int x){          //сумма цифр числа
        n=0;
        while(x!=0){
            n++;
            x/=10;
        }
        System.out.println(n);


        while(x!=0){
            tmp=x%10;
            sum+=(int)(Math.pow(tmp,n));
            x/=10;
        }
        System.out.println(sum);
        return sum;
    }


//    public int quantity(int x){          //количество цифр числа
//        n=0;
//        while(x!=0){
//            n++;
//            x/=10;
//        }
//        return n;
//    }

    public void getRes(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k: ");
        k=sc.nextInt();
        for(int i=1;i<=k;i++){
            if(sum(i)==i) {
                System.out.print(i + " |");
            }
        }
    }
}
