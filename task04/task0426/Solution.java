package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int a=num%2;
        if(num<0&&a==0) System.out.println("отрицательное четное число");
        else if(num==0) System.out.println("ноль");
        else if(num<0&&a!=0) System.out.println("отрицательное нечетное число");
        else if(num>0&&a==0) System.out.println("положительное четное число");
        else if(num>0&&a!=0) System.out.println("положительное нечетное число");

    }
}
