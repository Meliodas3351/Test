package com.company;



public class Factorial {
    int factorial, Sum=0;

    public void getFact(){
        for(int i=1;i<10;i++){
            if(i%2!=0){
                factorial=1;
                for(int j=1;j<=i;j++){
                    factorial*=j;
                }
                Sum+=factorial;
            }
        }
        System.out.println(Sum);
    }
}
