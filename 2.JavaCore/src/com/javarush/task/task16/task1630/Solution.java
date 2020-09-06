package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);

        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String nameFileToRead;
        String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.nameFileToRead = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

        @Override
        public void run() {
            File file = new File(nameFileToRead);

            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                 fileContent += sc.next() + " ";

                }
                fileContent = fileContent.trim();
                sc.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
