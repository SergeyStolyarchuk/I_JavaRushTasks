package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import javafx.animation.ScaleTransition;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            ArrayList<String> strokeList = new ArrayList<String>();
            while (true) {
                String strIn = reader.readLine();
                strokeList.add(strIn);
                if (strIn.equals("exit")) break;
            }


                BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileName));
                for (String s : strokeList) {
                    fileOut.write(s);
                    fileOut.newLine();

                }
                reader.close();
                fileOut.close();

    }
}
