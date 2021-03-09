package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] number = new int[10];
        for (int j = 0; j < list.length; j++) {
            String a = reader.readLine();
            list[j] = a;
            number[j] = a.length();
        }
        for (int i = 0; i < number.length; i++)
            System.out.println(number[i]);
    }
}
