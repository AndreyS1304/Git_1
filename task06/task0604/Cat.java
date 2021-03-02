package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;
    public String name;
    public int age;

    public Cat() {

        catCount++;
    }

    public Cat(String name, int age) {
        catCount++;
        this.name = name;
        this.age = age;
    }

    protected void finalize() throws Throwable {
        catCount--;
        super.finalize();

    }

    public static void main(String[] args) {

    }
}