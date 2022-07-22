package com.solvingProblems.HackerRank;

import java.util.List;

public class ArrayDS2D {

    //Problem link
    //https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true

    public static int hourglassSum(List<List<Integer>> arr) {
        Integer result = null;

        for(int y = 0; y < 4; y++) {
            for(int x = 0; x < 4; x++) {
                int a = arr.get(y).get(x);
                int b = arr.get(y).get(x+1);
                int c = arr.get(y).get(x+2);
                int d = arr.get(y+1).get(x+1);
                int e = arr.get(y+2).get(x);
                int f = arr.get(y+2).get(x+1);
                int g = arr.get(y+2).get(x+2);

                int sum = a + b + c + d +e + f + g;

                if(result == null || result < sum) {
                    result = sum;
                }
            }
        }

        return result;
    }
}
