package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        if (!clock.isInterrupted()){
            clock.interrupt();

        }

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();

        }

        public void run() {
                    try {
                        while (!isInterrupted()) {
                            if (numSeconds > 0) {
                                System.out.print(numSeconds + " ");
                                Thread.sleep(1000);
                                numSeconds--;
                            } else {
                                System.out.print("Марш!");
                                Thread.currentThread().interrupt();
                            }
                        }
                    } catch(InterruptedException e){
                            System.out.print("Прервано!");
                        }



        }
    }
}
