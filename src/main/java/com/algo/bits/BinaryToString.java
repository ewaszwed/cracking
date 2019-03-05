package com.algo.bits;

public class BinaryToString {

    public static String getBinaryFromANumber(double number) {

        if (number >= 1 || number <= 0) {
            System.out.println("ERROR");
        }

        StringBuilder binary = new StringBuilder();
        binary.append(".");
        while (number > 0) {
            if (binary.length() > 32) {
                System.out.println("ERROR");
            }
            double r = number * 2;
            if (r >= 1) {
                binary.append("1");
                number = r - 1;
            } else {
                binary.append("0");
                number = r;
            }
        }
        return binary.toString();
    }

    public static String getBinaryFromANumberFractions(double number) {

        if (number >= 1 || number <= 0) {
            System.out.println("ERROR");
        }

        StringBuilder binary = new StringBuilder();
        binary.append(".");
        double frac = 0.5;
        
        while (number > 0) {
            if (binary.length() > 32) {
                System.out.println("ERROR");
            }
            if (number >=frac) {
                binary.append("1");
                number = number - frac;
            } else {
                binary.append("0");
   
            }
            frac /=2;
        }
        return binary.toString();
    }
}
