package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            int s = 1;
            while(s<=10){
            System.out.print(s*i+" ");
            s++;
            }
            System.out.println();
            i++;
        }
    }
}
