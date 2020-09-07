package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayCreate = new ArrayList[10];
        for (int i=0; i < arrayCreate.length; i++) {
            arrayCreate[i] = new ArrayList<String>(Arrays.asList("first", "Two", "Three", "Four"));
            // arrayCreate[i].add("Two");
            //arrayCreate[i].add("Three");
            //arrayCreate[i].add("Four");
        };


        return arrayCreate;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}