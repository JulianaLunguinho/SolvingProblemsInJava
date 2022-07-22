package com.solvingProblems.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ArraysDS {

    //Problem link
    //https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> response = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i--) {
            response.add(a.get(i));
        }
        return response;
    }

}
