package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {

        return a+b;
    }

    public static int minus(int a, int b) {

        return a-b;
    }

    public static int multiply(int a, int b) {

        return a*b;
    }

    public static double division(int a, int b) {
        double e=1;
        return (a*e)/b;
    }

    public static double percent(int a, int b) {
        double c=100;
        return (a/c)*b;
    }

    public static void main(String[] args) {

    }
}