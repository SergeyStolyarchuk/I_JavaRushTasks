package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> listIntEnter = new ArrayList<Integer>();
        try {
            while (true) {
                listIntEnter.add(sc.nextInt());
            }
        }
        catch (InputMismatchException e) {
            for (Integer list:  listIntEnter){
                System.out.println(list);
            }
        }
    }
}
