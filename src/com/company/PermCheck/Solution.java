package com.company.PermCheck;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int [] A){
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            numbers.add(A[i]);
        }

        for (int i = 1; i <= A.length; i++) {
            if(!numbers.contains(i)){
                return 0;
            }
        }
        return 1;
    }
}
