package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        int a= Integer.parseInt(s);
        String s2 = reader.readLine();
        int b= Integer.parseInt(s2);
       if(a>0&b>0) System.out.println("1");
       else if (a>0&b<0) System.out.println("4");
       else if (a<0&b<0) System.out.println("3");
       else if (a<0&b>0) System.out.println("2");
    }
}
