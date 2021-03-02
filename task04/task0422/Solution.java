package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();
        int a= Integer.parseInt(s2);
        if(a<18) System.out.println("Подрасти еще");
    }
}
