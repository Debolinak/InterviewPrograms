package com.Programs;

public class removeWhiteSpavesFromString {
    public static String sampleName = "My name is Debolina";

    public static void main(String[] args) {
        String newName = sampleName.replaceAll(" ","");
        System.out.println(newName);
    }
}
