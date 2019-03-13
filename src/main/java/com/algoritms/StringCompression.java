//1.6

package com.algoritms;

public class StringCompression
{

    private static char[] getArray(String text)
    {
        char[] textAsArray = text.toCharArray();
        return textAsArray;
    }

    private static int countCompression(String input)
    {

        int compressedLength = 0;
        int countConsecutive = 0;

        for (int i = 0; i < input.length(); i++) {

            countConsecutive++;
            if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return compressedLength;

    }

    public static String compress(String input)
    {
        StringBuilder compressed = new StringBuilder();
        return handleString(input, compressed);
    }

    public static String compressEfficient(String input)
    {
        int finalLength = countCompression(input);
        if (finalLength >= input.length()) {
            return input;
        }
        StringBuilder compressed = new StringBuilder(finalLength);
        return handleString(input, compressed);
    }

    private static String handleString(String input, StringBuilder compressed)
    {
        char[] textAsArray = getArray(input);

        int count = 0;

        for (int i = 0; i < textAsArray.length; i++) {
            
            count++;

            if (i + 1 >= textAsArray.length || textAsArray[i] != textAsArray[i + 1]) {
   
         
                compressed.append(textAsArray[i]);
                compressed.append(count);
                count = 0;
            }
        }

        return compressed.length() < input.length() ? compressed.toString() : input;
    }
}
