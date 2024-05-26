//https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx + 1;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
