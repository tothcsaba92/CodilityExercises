package com.company.PermMissingElement;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{1,2,3,4,5,6,8,9,10};
        System.out.println(solution.solution(numbers));
    }

    public int solution (int [] A){
        long top = A.length +1;
        long low = 1;
        long height = A.length +1;

        long missingElement = (top + low) * height / 2;
        for (int i = 0; i < A.length; i++) {
            missingElement = missingElement - A[i];
        }
        return (int)missingElement;
    }
}
