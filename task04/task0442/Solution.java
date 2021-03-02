package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
         while (true) {
            int num1 = Integer.parseInt(reader.readLine());
            if (num1== -1)
            break;
            else i=i+num1;
         }
             System.out.println(i-1);
        }
    }

