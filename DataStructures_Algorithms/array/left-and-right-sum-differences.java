// https://leetcode.com/problems/left-and-right-sum-differences/
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            leftSum[0] = 0;
            leftSum[i] += nums[i - 1] + leftSum[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[nums.length - 1] = 0;
            rightSum[i] += nums[i + 1] + rightSum[i + 1];
        }

        for(int i=0; i<nums.length;i++){
            answer[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */
