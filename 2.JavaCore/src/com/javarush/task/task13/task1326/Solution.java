package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader readConsol = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = readConsol.readLine();
        int temp = 0;
        ArrayList<Integer> list = new ArrayList();
        FileInputStream readFile = new FileInputStream(inputFileName);
        int i;
        while ((i = readFile.read()) != -1) {
            list.add((int)(char)i);

        }
        readFile.close();
        System.out.println(list);
        list.stream()
                .filter(p->p % 2 == 0)
                .sorted()
                .forEach(s -> System.out.println(s));

    }
}
