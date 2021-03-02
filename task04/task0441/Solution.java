package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int max = Math.max(num1,(Math.max(num2,num3)));
        int min = Math.min(num1,(Math.min(num2,num3)));
        int med = (num1+num2+num3)-(max+min);
        System.out.println(med);
    }
}
