// https://leetcode.com/problems/richest-customer-wealth/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[0].length;j++){
                sum += accounts[i][j];
            }
            if(sum>max)max = sum;
            sum = 0;
        }
        return max;
    }
}

/**
 Complexity:
 Time:O(n^2) and Space:O(1)
 */
