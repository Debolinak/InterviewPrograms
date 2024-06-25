package com.Programs;

public class LongestWordInAString {
    public static String[] sampleString = {"DEBO", "DEBOLI", "DEBOLINA", "DEBOLINAKON", "DEB"};
    public static int length = sampleString.length;
    public static String longest = "";
    public static String shortest = sampleString[0];

    public static void main(String[] args) {
        for (String str : sampleString) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println(longest);

        for (String str : sampleString) {
            if (str.length() <shortest.length() ) {
                shortest = str;
            }
        }
        System.out.println(shortest);

    }
}
