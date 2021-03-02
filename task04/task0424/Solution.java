package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        int num= Integer.parseInt(s);
        String s2 = reader.readLine();
        int num2= Integer.parseInt(s2);
        String s3 = reader.readLine();
        int num3= Integer.parseInt(s3);
        if(num2==num3) {
            System.out.println("1");
        }
        else if (num==num2){
            System.out.println("3");
        }
        else if (num==num3){
            System.out.println("2");
        }

    }
}
