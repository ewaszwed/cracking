package com.algo.bits;

public class BitManipulation {

    public static boolean getBit(int number, int i) {

        // shift (left) 1 to ith position
        // and operation new number with number
        int comparator = 1 << i;
        int result = number & comparator;
        return result != 0;
    }

    public static boolean getBitCompact(int number, int i) {// bit position is zero numbered counting from right
        return ((number & (1 << i)) != 0);
    }

    public static int setBit(int number, int i) { // bit position is zero numbered counting from right
        int comparator = 1 << i;
        int result = number | comparator;
        return result;
    }

    public static int setBitCompact(int number, int i) { // bit position is zero numbered counting from right
        return (number | (1 << i));
    }

    public static int clearBit(int number, int i) {
        int mask = ~(1 << i);
        return number & mask;
    }

    public static int clearBitsFromMSBThroughI(int number, int i) {
        int mask = (1 << i) - 1;
        return number & mask;
    }

    public static int clearBitsFronITo0(int number, int i) {
        int mask = (-1 << (i + 1));
        return number & mask;
    }
    
    public static int updateBit(int number, int i, boolean bitIs1){
        int value = bitIs1? 1 : 0;
        int mask = ~(1 << i);
        return number & mask | value << i;      
    }

}
