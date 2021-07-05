package com.company;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Main{
    public static void main(String [] args){
        Armstrong arm = new Armstrong();
        arm.sum(25);

        System.out.println("Add New Line. Created commit");


        Couple.info();                                      //new code from new branch
        Date date = new Date();
        System.out.println(date.toString());
    }
}