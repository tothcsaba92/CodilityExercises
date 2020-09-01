package com.company.BinaryGap;

public class Solution {

    public int solution(int N) {
        int max_gap = 0;
        int current_gap = 0;
        boolean isCounting = false;

        while (N != 0) {
            if (isCounting == false) {
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
            N = N >> 1;
        }
        return max_gap;
    }
}
