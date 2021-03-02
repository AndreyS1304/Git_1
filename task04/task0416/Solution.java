package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(reader.readLine());
        double a = number % 5;
        if (a<3) {
            System.out.println("зелёный");
        } else if (a<4) {
            System.out.println("жёлтый");
        } else
            System.out.println("красный");


        }


    }
