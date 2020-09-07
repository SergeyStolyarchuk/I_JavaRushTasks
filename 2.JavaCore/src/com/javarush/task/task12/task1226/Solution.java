package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }
    public interface CanFly {
        public void fly ();
    }
    public interface CanClimb {
        public void climb();
    }
    public interface CanRun {
        public void run();
    }

    public abstract class Cat implements CanClimb, CanRun {
    }

    public abstract class Dog implements CanRun {
    }

    public abstract class  Tiger extends Cat {
    }

    public abstract class Duck implements CanFly, CanRun {
    }
}
