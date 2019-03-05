package com.algo.moderate;

public class Operations {

    public int negate(int num) {
        int neg = 0;
        int newSign = num < 0 ? 1 : -1;
        while (num != 0) {
            neg += newSign;
            num += newSign;
        }
        return neg;
    }

    public int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return negate(a);
        }
    }

    public int multiply(int x, int y) {

        if (x < y) {
            return multiply(y, x);
        }

        int sum = 0;

        for (int i = abs(y); i > 0; i--) {
            sum = sum + x;
        }

        if (y < 0) {
            sum = negate(sum);
        }

        return sum;
    }

    public int divide(int x, int y) {

        if (y == 0) {
            throw new ArithmeticException();
        }

        int absx = abs(x);
        int absy = abs(y);

        int product = 0;
        int count = 0;

        while (product + absy <= absx) {
            product += absy;
            count++;
        }

        if ((x < 0 && y < 0) || (x > 0 && y > 00)) {
            return count;
        } else {
            return negate(count);
        }

    }

    public int subtract(int x, int y) {
        return x + negate(y);
    }

}
