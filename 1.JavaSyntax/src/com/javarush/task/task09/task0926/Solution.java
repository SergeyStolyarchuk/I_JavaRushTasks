package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> listArInt = new ArrayList<int[]>();
        listArInt.add(new int[] {1, 2, 3, 4, 5});
        listArInt.add(new int[] {10, 20});
        listArInt.add(new int[] {100, 200, 300, 400});
        listArInt.add(new int[] {1000, 2000, 3000, 4000, 5000, 6000, 7000});
        listArInt.add(new int[0]);
        return listArInt;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
