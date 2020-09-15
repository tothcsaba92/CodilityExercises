package com.company.MinAvgTwoSlice;

public class Solution {

        public int solution(int[] A) {

            float min = Integer.MAX_VALUE;
            int minStartPosition =0;

            for(int i=0; i< A.length -2; i++){

                float avg2 = (float) (A[i]+A[i+1])/2;
                float avg3 = (float) (A[i]+A[i+1]+A[i+2])/3;
                float curMinAvg = Math.min(avg2, avg3);

                if(curMinAvg < min){
                    min = curMinAvg;
                    minStartPosition = i;
                }
            }

            int avg_2 = (A[A.length-2]+A[A.length-1]) / 2;
            if( avg_2 < min){
                minStartPosition = A.length-2;
            }

            return minStartPosition;
        }
}
