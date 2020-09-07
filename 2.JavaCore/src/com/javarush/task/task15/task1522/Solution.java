package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inParametr = null;
        try {
            inParametr = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (inParametr.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (inParametr.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (inParametr.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
