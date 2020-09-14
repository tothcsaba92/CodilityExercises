package com.company.FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] leaves = new int[]{1,3,1,4,2,3,5,4};
        System.out.println(solution.solution(5, leaves));
    }

    public int solution (int X, int[] A){
        Set<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            if( numbers.contains(A[i])){
                numbers.remove(A[i]);
            }
            if(numbers.isEmpty()){
                return i;
            }
        }
        return -1;
    }
}
