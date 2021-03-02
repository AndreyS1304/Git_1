package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    private String name = null;
    private int height = 0;
    private String color = null;

    public Dog(String name)    {
        this.name = name;
    }

    public Dog( String name,int height)    {
        this.name =  name;
        this.height = height;
    }

    public Dog( String name,int height,String colour)    {
        this.name =  name;
        this.height = height;
        this.color = colour;
    }

    public static void main(String[] args) {

    }
}
