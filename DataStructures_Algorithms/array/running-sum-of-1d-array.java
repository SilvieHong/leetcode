// https://leetcode.com/problems/running-sum-of-1d-array/
class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];

        if(nums.length == 1) return nums;
        for (int i = 0; i < sums.length-1; i++) {
            sums[0] = nums[0];
            sums[i+1] = nums[i+1] + sums[i];
        }
        
        return sums;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */
