package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner sc = new Scanner(System.in);
        String urlInput = sc.nextLine();
        int beginQuest = urlInput.indexOf("?") + 1;
        ArrayList <String> listOfParams = new ArrayList<String>();
        String paramName;
        boolean flag = true;

        while (flag) {
            int endParam = urlInput.indexOf("&", beginQuest);

            if (endParam < urlInput.length() && endParam > 0) {
                listOfParams.add(urlInput.substring(beginQuest, endParam));
                beginQuest = ++endParam;

            } else {
                listOfParams.add(urlInput.substring(beginQuest, urlInput.length()));
                flag = false;
            }

        }

        String objString = "";
        for (int i = 0; i < listOfParams.size(); i++) {
            if (listOfParams.get(i).contains("=") && listOfParams.get(i).substring(0, listOfParams.get(i).indexOf("=")).equals("obj")){

                objString = listOfParams.get(i).substring(listOfParams.get(i).indexOf("=")+1);

                listOfParams.set(i, listOfParams.get(i).substring(0, listOfParams.get(i).indexOf("=")));

            } else {
                if (listOfParams.get(i).contains("=")) {
                    listOfParams.set(i, listOfParams.get(i).substring(0, listOfParams.get(i).indexOf("=")));
                }
            }
        }

        listOfParams.forEach((n)->System.out.print(n + " "));
        System.out.println();

        if (!objString.equals("")){
        try {
            alert(Double.parseDouble(objString));
        }
        catch (Exception e) {
            alert(objString);
        }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
