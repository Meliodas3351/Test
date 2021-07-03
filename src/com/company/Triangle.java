package com.company;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника

public class Triangle {
    double a;
    public void getRes(){
        a=Math.random()*101;
        System.out.println("Сторона шестиугольника "+a);
        double S = a*a*Math.sqrt(a)/4;
        System.out.println("Площадь шестиугольника: "+6*S);
    }
}
