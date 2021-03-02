package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man =new Man("Bob",25,"Rs dfsf");
        Man man1 =new Man("Tom",20,"Rsdfsdf sdff");
        Woman woman=new Woman("Mary",27,"ssdkjk sds");
        Woman woman1=new Woman("Sara",21,"ssd kjkasds sdasds");
        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);
    }

    public static class Man {
        String name;
        int age;
        String address;
        public Man(String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;
        public Woman(String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;

        }
        public String toString() {
            return name + " " + age + " " + address;
        }

    }
}
