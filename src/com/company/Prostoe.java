package com.company;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми


public class Prostoe {
    public boolean res(int x){
        int count =0;
        for(int i=1;i<=x;i++){
            if(x%i==0) count++;
        }
        if(count==2){
//            System.out.println("Prostoe");
            return true;
        }else {
//            System.out.println("NeProstoe");
            return false;
        }
    }
    public void getRes(int a, int b, int c){
        res(a);
        res(b);
        res(c);
        if(res(a)&&(res(b)&&(res(c)))){
            System.out.println("Числа взаимно простые");
        }else System.out.println("Числа не взаимно простые");
    }
}
