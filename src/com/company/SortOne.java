package com.company;


//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//        дополнительный массив.
//

import java.util.Arrays;
import java.util.Scanner;

public class SortOne {
    int a [];
    int n,m,k;
    int b [];
    public void getSort() {

        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        System.out.println("m=");
        m = sc.nextInt();
        a = new int[n + m];
        b = new int[m];
        System.out.println("The one массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 11);
            System.out.print(a[i] + "|");
        }
        System.out.println('\n');

        for (int i = 0; i < m; i++) {
            b[i] = (int) (Math.random() * 11);
            System.out.print(b[i] + "|");
        }
        System.out.println('\n');

        System.out.println("Vvedite k ");
        k = sc.nextInt();
        if ((k >= 0) && (k < n)) {
            for (int i = k + 1; i < n; i++) {
                a[a.length - (n - i)] = a[i];
            }
            int p = 0;
            for (int j = k + 1; j < ((k + 1) + m); j++) {
                a[j] = b[p];
                p++;
            }
            System.out.println(Arrays.toString(a));
        } else
            System.out.println("Нет данного элемента");
    }
}
