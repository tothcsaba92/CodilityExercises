package com.company.MaxCounters;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 4, 4, 6, 1, 4, 4};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(5, numbers)));

    }

    public int[] solution(int N, int[] A) {
        int max = 0;
        int min = 0;
        int[] numbers = new int[N];

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                if (numbers[A[i] - 1] < min) {
                    numbers[A[i] - 1] = min;
                }
                numbers[A[i] - 1]++;
                if (numbers[A[i] - 1] > max) {
                    max = numbers[A[i] - 1];
                }
            } else if (A[i] == N + 1) {
                min = max;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                numbers[i] = min;
            }
        }
        return numbers;
    }
}
