package com.company;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.


import java.util.Arrays;
import java.util.Scanner;

public class Prune {
    int arr [];
    int n;

    public void getPrune(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива: ");
            n=sc.nextInt();
            arr=new int[n];
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for(int i= 1;i<arr.length;i++){
            if(i%2!=0){

                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i;j<arr.length-1;j++) {
                    arr[j] = arr[j + 1];

                }
                arr[arr.length-1]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
