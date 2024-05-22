//https://leetcode.com/problems/number-of-1-bits/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        String binary = Integer.toBinaryString(n);
        for(int i=0; i<binary.length();i++){
            if(binary.charAt(i)=='1')cnt++;
        }
        return cnt;
    }
}
/**
 * Complexity:
 * Time:O(logn) and Space:O(logn)
 */
