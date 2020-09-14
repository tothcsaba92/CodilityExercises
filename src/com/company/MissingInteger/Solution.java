package com.company.MissingInteger;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        int [] numbers = new int[]{1,2,3};
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
    }

    public int solution (int[] A){
        if(A.length == 0){
            return 1;
        }
        Set<Integer> numbers =new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            numbers.add(A[i]);
        }

        for (int i = 1; i < A.length; i++) {
            if(!numbers.contains(i)){
                return i;
            }
        }
        return A.length+1;
    }
}
