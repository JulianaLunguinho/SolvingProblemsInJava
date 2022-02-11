package com.solvingProblems.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //Problem link
    //https://leetcode.com/problems/fizz-buzz/

    public List<String> fizzBuzz(int n) {
        List<String> response = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            String answer;

            answer = i % 3 == 0? "Fizz" : "";
            answer = i % 5 == 0? answer + "Buzz" : answer;

            if(answer == "") {
                answer = String.valueOf(i);
            }

            response.add(answer);
        }

        return response;
    }

}
