// https://leetcode.com/problems/xor-operation-in-an-array/
class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            result ^= nums[i];
        }
        return result;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
