package com.algoritms;

public class StringManipulationTests {

    private static void testString(int num) {
        String s = "";
        long time = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            s += ".";
        }
        time = System.currentTimeMillis() - time;
        System.out.println("For pure String: "+ time);
    }

    private static void testStringBuffer(int num) {
        StringBuffer s = new StringBuffer();
        long time = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            s.append(".");
        }
        time = System.currentTimeMillis() - time;
        System.out.println("For StringBuffer: "+ time);
    }

    private static void testStringBuilder(int num) {
        StringBuilder s = new StringBuilder();
        long time = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            s.append(".");
        }
        time = System.currentTimeMillis() - time;
        System.out.println("For StringBuilder: "+ time);
    }
    
    public static void main(String[] args) {
        int num = 2000;
        testString(num);
        testStringBuffer(num);
        testStringBuilder(num);
    }
}