package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int x = Integer.parseInt(reader.readLine());
                int y = Integer.parseInt(reader.readLine());
                if (x < 0 || y < 0) {throw new NumberFormatException();} else {
                Nod(x, y);
                break;}
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }

    }
    public static void Nod (int x, int y){
        int temp = 0;
        if (x < y) {
            temp = x;
            x = y;
            y = temp;
        }
        x = x % y;
        if (x != 0) {
            Nod(x,y);
        } else System.out.println(y);


    }
}
