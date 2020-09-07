package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        String simpleName = "";
        switch (o.getClass().getSimpleName()){
            case ("Cat"):
                simpleName = "Кошка";
                break;
            case ("Bird"):
                simpleName = "Птица";
                break;
            case ("Lamp"):
                simpleName = "Лампа";
                break;
            case ("Dog"):
                simpleName = "Собака";
                break;
        }
        System.out.println(simpleName);
    }

    public static class Cat {
        }

    public static class Dog {

    }

    public static class Bird {

    }

    public static class Lamp {
        }
    }

