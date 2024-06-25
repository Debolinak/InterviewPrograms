package com.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInAString {
    public static String sampleString = "MY MY NAME IS IS Debolina";
    public static int length = sampleString.length();

    public static void main(String[] args) {
        Map<String, Integer> cntrMap = new HashMap<>();
        String[] strArr = sampleString.split(" ");
        for (String str : strArr) {
            Integer integer = cntrMap.get(str);

            if (integer == null) {
                cntrMap.put(str , 1);
            }
            else {
                cntrMap.put(str, cntrMap.get(str) + 1);
            }
        }
        System.out.println(cntrMap);
    }
}
