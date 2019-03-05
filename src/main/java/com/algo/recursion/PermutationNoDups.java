package com.algo.recursion;

import java.util.ArrayList;

public class PermutationNoDups {

    public static ArrayList<String> getAllPerms(String word) {

        ArrayList<String> perms = new ArrayList<>();

        if (word.length() == 0) {
            perms.add("");
            return perms;
        }
        
        if(word.length() == 1){
            perms.add(word);
            return perms;
        }
        
        char first = word.charAt(0);
        String remainder = word.substring(1);
        ArrayList <String> previous = getAllPerms(remainder);

        for (int i = 0; i < previous.size(); i++) {
            String permutation = previous.get(i);
            for (int j = 0; j <= permutation.length(); j++) {               
                String prod = buildString(permutation, j, first);
                perms.add(prod);

            }
        }       
        return perms;
    }

    private static String buildString(String permutation, int j, char first) {
        String head = permutation.substring(0, j);
        String tail = permutation.substring(j);
        String prod = head + first + tail;
        return prod;
    }
    
    public static void main(String[] args) {
        ArrayList<String> all = getAllPerms("ewas");
        for(String word: all){
            System.out.println(word);
        }
    }
}