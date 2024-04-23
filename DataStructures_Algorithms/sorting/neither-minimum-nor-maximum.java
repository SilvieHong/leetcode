//https://leetcode.com/problems/neither-minimum-nor-maximum/
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = 100;
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != min && nums[i] != max) return nums[i];
        }
        
        return -1;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
