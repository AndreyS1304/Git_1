package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
             double a= Math.pow((x2-x1),2);
             double b =Math.pow((y2-y1),2);
             double d=Math.sqrt(a+b);
        return d;
    }

    public static void main(String[] args) {

    }
}
