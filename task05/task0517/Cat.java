package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name = null;
    private int age = 0;
    private int weight = 0;
    private String color = null;
    private String address = null;

   public Cat(String name)    {
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "white";
    }

   public Cat( String name,int weight,int age)    {
        this.name =  name;
        this.weight = weight;
        this.age = age;
        this.color = "white";

    }
   public Cat( String name,int age)    {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "white";


    }

    public Cat( int weight,String color)    {
        this.color =  color;
        this.weight = weight;
        this.age = 2;

    }
    public Cat( int weight,String color,String address)    {
        this.color =  color;
        this.weight = weight;
        this.address = address;
        this.age = 2;

    }

    public static void main(String[] args) {

    }
}
