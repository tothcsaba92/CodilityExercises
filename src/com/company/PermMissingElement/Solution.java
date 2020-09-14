package com.company.PermMissingElement;

public class Solution {
    public int solution (int [] A){
        long top = A.length +1;
        long low = 1;
        long height = A.length +1;
        long sum =  (top + low) * height / 2;

        long missingElement = sum;
        for (int i = 0; i < A.length; i++) {
            missingElement = missingElement - A[i];
        }
        return (int)missingElement;
    }
}
