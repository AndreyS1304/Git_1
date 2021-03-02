package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (0<num&&num<1000){
        String pm,zn;
        pm = (num % 2==0 )?"чётное ":"нечётное ";
        zn = (num<10)?"однозначное ":(num<99)?"двухзначное ":"трехзначное ";
            System.out.println(pm+zn+"число");
        }


    }
}
