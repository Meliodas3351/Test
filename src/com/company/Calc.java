package com.company;

import java.util.Scanner;

public class Calc  {
    public void getResult(){
        double a,b;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        a=sc.nextDouble();
        System.out.println("Vvedite operation");
        op=sc.next().charAt(0);
        System.out.println("Vvvedite chislo");
        b=sc.nextDouble();
        if(op=='+'){
            System.out.println(a+b);
        }else
        if(op=='-'){
            System.out.println(a-b);
        }
        else
        if(op=='*'){
            System.out.println(a*b);
        }
        else
        if(op=='/'){
            System.out.println(a/b);
        }
        else System.out.println("None operation");
    }
}
