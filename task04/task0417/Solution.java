package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
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
        if(num==num2&num==num3&num2==num3){
            System.out.println(num+" "+num2+" "+num3);
        }
        else if(num2==num3) {
            System.out.println(num2+" "+num3);
        }
        else if (num==num2){
            System.out.println(num+" "+num2);
        }
        else if (num==num3){
            System.out.println(num+" "+num3);
        }
        else if (num != num2 & num != num3 & num2 != num3) {
            System.out.print("");
        }


        }


    }
