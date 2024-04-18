//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1]*nums[nums.length - 2] - nums[0]*nums[1];
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(1)
 */





class betterSolution {
    public int maxProductDifference(int[] nums) {
        int[] firstPair = findMax_Min(nums);
        int[] secondPair = findMax_Min(nums);
        return ((firstPair[0] * secondPair[0]) - (firstPair[1] * secondPair[1]));
    }

    private static int[] findMax_Min(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i] < min && nums[i] != 0) {
                min = nums[i];
                minIndex = i;
            }
        }
        // make biggest nums and smallest nums to 0
        nums[maxIndex] = 0;
        nums[minIndex] = 0;
        return new int[]{max, min};
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
