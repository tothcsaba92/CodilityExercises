package CountDiv;

public class Solution {
    public int solution (int A, int B, int K){
        int BVal = (int) Math.floor(B/K);
        int AVal = (int) Math.floor(A/K);
        int divisions = BVal - AVal;
        int plus = 0;

        if( A % K == 0)
            plus = 1;
        divisions += plus;
        return divisions;
    }
}
