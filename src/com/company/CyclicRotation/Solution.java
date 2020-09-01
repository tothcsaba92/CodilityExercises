package com.company.CyclicRotation;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int array []  = new int[]{5, 10, 15, 20, 25};
        System.out.println(Arrays.toString(solution.solution(array, 2)));
    }

    public int[] solution(int[] A, int K) {

        int [] array = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newPosition = (i + K) % A.length;
            array[newPosition] = A[i];
        }
        return array;
    }
}
