package com.company.OddOccurencesInArray;

public class Solution {

    public static void main(String[] args) {
        int[] array = {9, 3, 9, 3, 9, 7, 9};
        Solution solution = new Solution();
        System.out.println(solution.solution(array));
    }

    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int unpaired = A[0];
        for (int i = 1; i < A.length; i++) {
            unpaired = unpaired ^ A[i]; // xor bitwise operator
        }
        return unpaired;
    }

 //               5 ^ 4 => 1  0  1   (5)
//            1  0  0   (4)
//                    ----------
//            0  0  1   => 1
}
