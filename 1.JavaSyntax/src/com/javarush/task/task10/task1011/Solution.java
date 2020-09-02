package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char[] strokeLine = s.toCharArray();
        for (int i = 0; i < 40; i++){
            for (int y = i; y < strokeLine.length; y++){
                System.out.print(strokeLine[y]);
            } System.out.println();
        }
    }

}

