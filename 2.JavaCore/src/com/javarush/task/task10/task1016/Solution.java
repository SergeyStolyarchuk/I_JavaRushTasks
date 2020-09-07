package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        int count = 0;
        for(int x = 0; x < list.size(); x++){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(x).equals(list.get(i)) && !result.containsKey(list.get(x))) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(list.get(x), count);
                //System.out.println(list.get(x) + "  " + count);
                count = 0;
            }
        }



        return result;
    }

}

