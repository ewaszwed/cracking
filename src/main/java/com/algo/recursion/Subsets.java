package com.algo.recursion;

import java.util.ArrayList;

public class Subsets {

    public static ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> set, int index) {

        ArrayList<ArrayList<Integer>> subsets;

        if (set.size() == index) {// base case add empty set
            subsets = new ArrayList<>();
            subsets.add(new ArrayList<>());// adding empty set
        } else {

            subsets = getAllSubsets(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<>();
            for (ArrayList<Integer> subset : subsets) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            subsets.addAll(moreSubsets);
        }
        return subsets;
    }
}
