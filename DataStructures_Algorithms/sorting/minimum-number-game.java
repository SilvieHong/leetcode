//https://leetcode.com/problems/minimum-number-game/
class Solution {
    public int[] numberGame(int[] nums) {
        // Sort the array in increasing order
        Arrays.sort(nums);

        // swap the adjacent elements
        for (int i = 0; i < nums.length; i=i+2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}

/**
 * Complexity:
 * Time:O(nlogn) and Space:O(logn)
 */
