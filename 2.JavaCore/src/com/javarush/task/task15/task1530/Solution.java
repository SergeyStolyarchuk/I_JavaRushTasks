package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        LatteMaker lM = new LatteMaker();
        lM.makeDrink();
        TeaMaker tM = new TeaMaker();
        tM.makeDrink();
    }
}
