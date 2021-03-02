package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String name = reader.readLine();
        String name2 = reader.readLine();
        int length1 = name.length();
        int length2 = name2.length();
            if (name.equals(name2)) System.out.println("Имена идентичны");
            else if (length1 == length2) System.out.println("Длины имен равны");
        }
    }

