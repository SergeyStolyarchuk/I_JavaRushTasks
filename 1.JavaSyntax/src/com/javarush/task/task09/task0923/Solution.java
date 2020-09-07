package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.sql.Array;
import java.util.Scanner;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static char[] znak = new char[]{',', '.', '!', '?'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String strokeInput = sc.nextLine();
        char[] arrayOfChar = strokeInput.toCharArray();
        String strokeIsVowel = "", strokeNoVowel = "";
        for (int i = 0; i < arrayOfChar.length; i++) {
            if (isVowel(arrayOfChar[i])) {
                strokeIsVowel += arrayOfChar[i] + " ";
            }
            else if (Character.isWhitespace(arrayOfChar[i])) {

            }
            else if (isZnak(arrayOfChar[i])) {
                strokeNoVowel += arrayOfChar[i] + " ";
            }
            else strokeNoVowel += arrayOfChar[i] + " ";

        }
        System.out.println(strokeIsVowel);
        System.out.println(strokeNoVowel);
     }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
    public static boolean isZnak(char c) {

        for (char d : znak) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}