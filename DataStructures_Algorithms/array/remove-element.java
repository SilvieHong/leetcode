//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
