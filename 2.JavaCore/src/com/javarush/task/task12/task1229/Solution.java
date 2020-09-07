package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

import java.security.PublicKey;

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public static class Worker {
        public void workHard() {
            System.out.println("Uff Hard Work...");
        }
    }
    public static class CTO extends Worker implements Businessman {

    }
}
