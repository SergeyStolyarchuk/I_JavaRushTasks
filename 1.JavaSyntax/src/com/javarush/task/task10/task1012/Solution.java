package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

        //alphabet.stream().forEach(System.out::println);
        String fullLine = "";
        //list.stream().forEach(fullLine += list.get());
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            fullLine += iterator.next();
        }
        //System.out.println(fullLine);
        char[] lineCharArr = fullLine.toCharArray();
        int countOfChar = 0;

        for (Iterator<Character> iterator = alphabet.iterator(); iterator.hasNext();) {
            char itNext = iterator.next();
            System.out.print(itNext);
            for (int i = 0; i < lineCharArr.length; i++) {
                if (itNext == lineCharArr[i]){
                    countOfChar++;
                }

            }
            System.out.println(" " + countOfChar);
            countOfChar = 0;
        }
    }
}
