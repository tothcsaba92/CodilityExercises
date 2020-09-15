package com.company.PassingCars;

public class Solution {
    public static void main(String[] args) {
        int [] carsPositions = new int[]{0,1,0,1,1};
        Solution solution = new Solution();
        System.out.println(solution.solution(carsPositions));
    }


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
