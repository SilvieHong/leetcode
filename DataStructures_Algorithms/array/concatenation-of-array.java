// https://leetcode.com/problems/concatenation-of-array/
class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] answer = new int[nums.length*2];
        for(int i=0; i<answer.length; i++){
            answer[i] = i<nums.length? nums[i] : nums[i-nums.length];
        }
        return answer;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
