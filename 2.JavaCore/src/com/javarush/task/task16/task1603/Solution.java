package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread thr1 = new SpecialThread();
        SpecialThread thr2 = new SpecialThread();
        SpecialThread thr3 = new SpecialThread();
        SpecialThread thr4 = new SpecialThread();
        SpecialThread thr5 = new SpecialThread();


            list.add(new Thread(thr1));
        list.add(new Thread(thr2));
        list.add(new Thread(thr3));
        list.add(new Thread(thr4));
        list.add(new Thread(thr5));


    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
