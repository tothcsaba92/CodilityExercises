package com.company.FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] leaves = new int[]{1,3,1,4,2,3,5,4};
        System.out.println(solution.solution(5, leaves));
    }

    public int solution(int X, int[] A) {
        int jumps = X;
        boolean[] leaves = new boolean[jumps+1];
        for(int i = 0; i < A.length; i++){
            if(!leaves[A[i]]){
                leaves[A[i]] = true;
                jumps--;
                if(jumps == 0) return i;
            }

        }
        return -1;
    }
}
