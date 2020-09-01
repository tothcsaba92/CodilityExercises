package com.company.BinaryGap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(25));
    }

    public int solution(int N) {
        int max_gap = 0;
        int current_gap = 0;
        boolean isCounting = false;

        while (N != 0) {
            if (!isCounting) {
                //Sets each bit to 1 if both bits are 1
                if ((N & 1) == 1) {
                    isCounting = true;
                }
            } else {
                if ((N & 1) == 0) {
                    current_gap++;
                } else {
                    max_gap = Math.max(max_gap, current_gap);
                    current_gap = 0;
                }
            }
            //Shift right by pushing copies of the leftmost bit in from the left and letting the rightmost bits fall off
            N = N >> 1;
        }
        return max_gap;
    }
}
