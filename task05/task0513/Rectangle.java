package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top = 0;
    int left = 0;
    int width = 0;
    int height = 0;

    public void initialize(int top,int left,int width, int height)    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top,int left)    {
        this.top = top;
        this.left = left;

    }

    public void initialize(int top,int left,int width)    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize()  {

    }

    public static void main(String[] args) {

    }
}
