package com.Programs;

public class print1_10WithoutLoop {
    public static void print1_10WithoutLoop(int n) {
        //int k = 0;
        if (n >= 0) {
            System.out.println(n);
            print1_10WithoutLoop(n - 1);
        }
    }
    public static void main(String[] args) {
        print1_10WithoutLoop(10);
    }
}
