package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStroke;

            inputStroke = reader.readLine();

        if (inputStroke.equals("helicopter")) {
            result = new Helicopter();
        } else if (inputStroke.equals("plane")) {
           while (true) {
               try {
                   result = new Plane(Integer.parseInt(reader.readLine()));
                   break;
               } catch (Exception e) {
                   System.out.println("Введите количество пассажиров");
               }
           }
        }
        reader.close();
    }
}
