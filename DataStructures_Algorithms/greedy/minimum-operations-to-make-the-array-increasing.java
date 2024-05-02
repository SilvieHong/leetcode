//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp;
            if (nums[i] <= nums[i - 1]) {
                temp = nums[i];
                nums[i] = nums[i - 1] + 1;
                cnt += nums[i] - temp;
            }
        }
        return cnt;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
