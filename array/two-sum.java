// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }
}

/**
 * Complexity:
 * Time:O(n^2) and Space:O(1)
 */
