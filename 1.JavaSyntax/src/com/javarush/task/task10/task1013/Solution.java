package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age = 0;
        private Boolean sex = true;
        private int weight = 0;
        private int height = 0;
        private int endurance = 0;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, Boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, Boolean sex, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age, Boolean sex, int weight, int height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, Boolean sex, int weight, int height, int endurance) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.endurance = endurance;
        }

        public Human(String name, int weight, int height, int endurance) {
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.endurance = endurance;
        }

        public Human(String name, Boolean sex) {
            this.name = name;
            this.sex = sex;
        }
        public Human() {

        }

        public Human(String name, Boolean sex, int weight, int height, int endurance) {
            this.name = name;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.endurance = endurance;
        }
    }
}
