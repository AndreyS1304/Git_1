package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        int num= Integer.parseInt(s);
        String s2 = reader.readLine();
        int num2= Integer.parseInt(s2);
        if(num<num2) System.out.println(num);
        else if(num>num2) System.out.println(num2);
        else if(num==num2) System.out.println(num);
    }
}