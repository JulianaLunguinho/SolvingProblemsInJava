package com.solvingProblems.HackerRank;

import java.util.Stack;

public class BalancedBrackets {

    //Problem link
    //https://www.hackerrank.com/challenges/balanced-brackets/problem?isFullScreen=true

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char pop = stack.pop();

                if(c == '}' && pop != '{') {
                    return "NO";
                }
                if(c == ']' && pop != '[') {
                    return "NO";
                }
                if(c == ')' && pop != '(') {
                    return "NO";
                }
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES";
    }

}
