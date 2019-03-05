package com.algo.bits;

import java.util.ArrayList;

// you have an integer and you can flip exactly one bit from a 0 to 1, 
// write a code to find the length of the longest sequence of 1 you can create that way
public class FlipBitToWinBruteForce {

    public static int longestSequence(int number) {

        ArrayList<Integer> sequences = getAlternatingSequences(number);
        return findLongestSequence(sequences);
    }

    private static ArrayList<Integer> getAlternatingSequences(int number) {

        ArrayList<Integer> sequences = new ArrayList<>();
        int searchingFor = 0;
        int counter = 0;
        for (int i = 0; i < Integer.BYTES * 8; i++) {
            if ((number & 1) != searchingFor) {

                sequences.add(counter);
                searchingFor = number & 1;
                counter = 0;
            }
            counter++;
            number >>>= 1;
        }
        sequences.add(counter);
        return sequences;
    }

    private static int findLongestSequence(ArrayList<Integer> seq) {
        int maxSeq = 1;
        for (int i = 0; i < seq.size(); i++) {

            int zerosSeq = seq.get(i);
            int onesSeqRight = i - 1 >= 0 ? seq.get(i - 1) : 0;
            int onesSeqLeft = i + 1 < seq.size() ? seq.get(i + 1) : 0;

            int thisSeq = 0;

            if (zerosSeq == 1) {
                thisSeq = onesSeqLeft + 1 + onesSeqRight;

            }
            if (zerosSeq > 1) {

                thisSeq = 1 + Math.max(onesSeqLeft, onesSeqRight);

            } else if (zerosSeq == 0) {

                thisSeq = Math.max(onesSeqLeft, onesSeqRight);

            }

            maxSeq = Math.max(thisSeq, maxSeq);

        }
        return maxSeq;
    }

}
