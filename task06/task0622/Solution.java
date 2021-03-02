package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for(int i=array.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

  }
