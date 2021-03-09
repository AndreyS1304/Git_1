package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] list2 = new int[10];
        int[] list3 = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        list2 = Arrays.copyOf(list, 10);
        list3 = Arrays.copyOfRange(list, 10, 20);
        for (int i = 0; i < 10; i++) {
            System.out.println(list3[i]);
        }


    }
}

