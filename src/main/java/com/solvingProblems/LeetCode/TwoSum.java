package com.solvingProblems.LeetCode;

public class TwoSum {

    //Problem link
    //https://leetcode.com/problems/two-sum/

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i1 = 0; i1 < nums.length; i1++) {
            for (int i2 = 0; i2 < nums.length; i2++) {
                if(i1 == i2) {
                    continue;
                }

                var sum = nums[i1] + nums[i2];

                if (sum == target) {
                    answer[0] = i1;
                    answer[1] = i2;

                    break;
                }
            }
        }

        return answer;
    }

}
