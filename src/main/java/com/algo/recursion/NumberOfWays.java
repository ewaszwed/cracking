package com.algo.recursion;

public class NumberOfWays {

    public static int getNumberOfWays(int max, int[] memo) {
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 3;
        memo[3] = 4;
        if (memo[max] == 0) {
            memo[max] = getNumberOfWays(max - 3, memo) + getNumberOfWays(max - 2, memo)
                    + getNumberOfWays(max - 1, memo);
        }
        return memo[max];
    }

    public static int getNumberOfWays(int number) {
        int[] memo = new int[number + 1];
        return getNumberOfWays(number, memo);
    }
}
