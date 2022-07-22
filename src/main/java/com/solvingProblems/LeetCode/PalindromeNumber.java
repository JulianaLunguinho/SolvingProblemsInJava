package com.solvingProblems.LeetCode;

import java.util.Arrays;

public class PalindromeNumber {

    //Problem link
    //https://leetcode.com/problems/palindrome-number/

    public boolean isPalindrome(int x) {
        char[] number = String.valueOf(x).toCharArray();
        char[] result = new char[number.length];

        int ir = 0;
        for (int in = number.length - 1; in >= 0; in--) {
            result[ir] = number[in];
            ir++;
        }

        return Arrays.equals(result, number);
    }

}
