// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
class Solution {
    public int subtractProductAndSum(int n) {
        int multiple = 1;
        int sum = 0;
        
        for(int i=0; i<Integer.toString(n).length();i++){
            multiple *= Integer.parseInt(Integer.toString(n).substring(i,i+1));
            sum += Integer.parseInt(Integer.toString(n).substring(i,i+1));
        }

        return multiple - sum;
    }
}

/**
 Complexity:
 Time:O(1) and Space:O(1)
 */
