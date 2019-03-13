//1.3

package com.algoritms;

public class URLification
{
    private static char[] getArray(String text)
    {
        char[] textAsArray = text.trim().toCharArray();
        return textAsArray;
    }

    private static String getStringForArray(char[] array)
    {

        StringBuilder builder = new StringBuilder();
        for (char value : array) {
            builder.append(value);
        }
        String text = builder.toString();
        return text;

    }

    public static String urlIfy(String text, int length)
    {
        char[] textAsArray = getArray(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (textAsArray[i] == ' ') {
                spaceCount++;
            }
        }

        int index = length + spaceCount * 3;

        if (length < textAsArray.length) {
            textAsArray[length] = '\0';
        }

        for (int i = length - 1; i >= 0; i--) {
            if (textAsArray[i] == ' ') {
                textAsArray[index - 1] = '0';
                textAsArray[index - 2] = '2';
                textAsArray[index - 3] = '%';
                index = index - 3;
            }
            else {
                textAsArray[index - 1] = textAsArray[i];
                index--;
            }
        }
        String output = getStringForArray(textAsArray);
        return output;
    }
}
