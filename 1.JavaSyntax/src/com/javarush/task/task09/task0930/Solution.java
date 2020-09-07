package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        boolean flag = true;
        int count = 0;
        int isDigital = 0;
        int isDigitalIndex = 0;
        while (flag) {
            flag = false;
            count = 0;
            isDigital = 0;
            isDigitalIndex = -1;
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[count])){
                    if (isDigitalIndex == -1) {
                        isDigital = Integer.parseInt(array[count]);
                        isDigitalIndex = count;
                    } else {
                        if (isDigital < Integer.parseInt(array[count])){ //если число а < б меняем их местами

                            array[isDigitalIndex] = array[count]; // меняем местами
                            array[count] = Integer.toString(isDigital);

                            isDigital = Integer.parseInt(array[count]); // обновляем временные переменные
                            isDigitalIndex = count;

                            flag = true;
                        }
                    }
                }
                count++;
            }
        }

        //ищем и сортируем слова
        //System.out.println("начали проверять слова");
        flag = true;
        String isString;
        int isStringIndex = 0;
        while (flag) {
            //for (String x : array) {
             //   System.out.println(x);
            //}
            flag = false;
            count = 0;
            isString = "";
            isStringIndex = 0;
            for (int i = 0; i < array.length; i++) { //System.out.println(count + "  счетчик");
                if (isNumber(array[count])){/*System.out.println("это число");*/} else{ //System.out.println("это не число");
                    if (isString.equals("")) {
                        isString = array[count];
                        isStringIndex = count;
                    } else {//System.out.println("Текущий элемент " + array[count] + ", сравниваем с - " + isString);
                        if (isGreaterThan(isString, array[count])){ //если число а > б меняем их местами
                            //System.out.println("Меняем местами - " + isString + " -> " + array[count]);
                            array[isStringIndex] = array[count]; // меняем местами
                            array[count] = isString;

                            isString = array[count]; // обновляем временные переменные
                            isStringIndex = count;
                            //System.out.println("обновили переменные - " + isString + " -> " + isStringIndex);
                            flag = true;
                        }
                        else {
                            isString = array[count]; // обновляем временные переменные
                            isStringIndex = count;

                        }
                    }
                }
                count++;
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
