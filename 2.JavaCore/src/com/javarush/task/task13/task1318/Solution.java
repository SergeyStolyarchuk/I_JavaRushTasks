package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            InputStream fileInput = new FileInputStream(reader.readLine());
            BufferedReader fileIn = new BufferedReader(new InputStreamReader(fileInput));
            while (fileIn.ready()) {
                System.out.println(fileIn.readLine());
            }

            fileInput.close();
            reader.close();
        }
        catch(IOException e) {
            System.out.print(e);
        }


    }
}