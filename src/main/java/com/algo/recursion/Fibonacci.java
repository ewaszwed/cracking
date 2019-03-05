package com.algo.recursion;

public class Fibonacci {

    public static int getFibonacciAtNth(int n) {

        if (n == 1 || n == 0) {
            return n;
        } else {
            int number = getFibonacciAtNth(n - 1) + getFibonacciAtNth(n - 2);

            return number;
        }
    }

    public static int getFibonacciFaster(int n) {
        return getFibonacciFaster(n, new int[n + 1]);
    }

    public static int getFibonacciFaster(int n, int[] memo) {
        if (n == 1 || n == 0) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = getFibonacciFaster(n - 1, memo) + getFibonacciFaster(n - 2, memo);
        }
        return memo[n];

    }

    public static int fibonacciBottomUp(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n - 1] + memo[n - 2];
    }

    public static void withTime(int number) {
        long startTime = System.currentTimeMillis();
        System.out.println("number: " + getFibonacciAtNth(number));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time for: " + number + " - " + elapsedTime);
    }

    public static void fasterWithTime(int number) {
        long startTime = System.currentTimeMillis();
        System.out.println("number: " + getFibonacciFaster(number));
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time for: " + number + " - " + elapsedTime);
    }

    public static void main(String[] args) {
        fasterWithTime(10);
        fasterWithTime(20);
        fasterWithTime(50);
        fasterWithTime(100);
        fasterWithTime(200);
        fasterWithTime(500);
        fasterWithTime(1000);
        fasterWithTime(2000);
        fasterWithTime(5000);
    }

}
