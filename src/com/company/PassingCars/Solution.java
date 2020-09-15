package com.company.PassingCars;

public class Solution {
    public int solution(int [] A){
        int carsToEast = 0;
        int carsToWest = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0){
                carsToEast++;
            }
            if(A[i] == 1){
                carsToWest += carsToEast;
            }
        }

        if (carsToWest > 1000000000 || carsToWest < 0) {
            return -1;
        } else {
            return carsToWest;
        }

    }
}
