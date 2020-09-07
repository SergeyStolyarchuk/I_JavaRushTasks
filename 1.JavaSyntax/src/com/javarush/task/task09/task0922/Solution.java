package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String inputDate;

            SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
            Scanner sc = new Scanner(System.in);
            Date dateInput = inputFormatter.parse(sc.next());
            SimpleDateFormat outputFormatter = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(outputFormatter.format(dateInput).toUpperCase());


    }

}
