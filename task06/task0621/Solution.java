package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catgrandFather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catgrandMother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, grandfatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandmotherName, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, motherName, fatherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, motherName, fatherName);

        System.out.println(catgrandFather);
        System.out.println(catgrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private final String name;
        private String mother;
        private String father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, String mother, String father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother" + ", no father";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + father;
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother + ", father is " + father;
        }
    }

}
