//https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
