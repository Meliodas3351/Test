package com.company;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

import java.util.Scanner;

public class AreaQuadrangle {
    int x,y,z,t;
    double diagonal, AreaRes,AreaOne, AreaTwo, semiPerimetr;


    public void getArea(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter X: ");
        x=sc.nextInt();
        System.out.println("Enter Y: ");
        y=sc.nextInt();
        System.out.println("Enter Z: ");
        z=sc.nextInt();
        System.out.println("Enter T: ");
        t=sc.nextInt();
        diagonal=Math.sqrt(x*x+y*y);
        AreaOne=(double)(x*y)/2;
        semiPerimetr=(z+t+diagonal)/2;
        AreaTwo=Math.sqrt(semiPerimetr*(semiPerimetr-z)*(semiPerimetr-t)*(semiPerimetr-diagonal));
        AreaRes=AreaOne+AreaTwo;
        System.out.println("Площадь прямоугольного треугольника"+AreaOne);
        System.out.println("Площадь треугольника по трем сторонам"+AreaTwo);
        System.out.println("Итоговая площадь четырехугольника "+AreaRes);
    }
}