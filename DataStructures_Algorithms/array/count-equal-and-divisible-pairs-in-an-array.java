//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
class Solution {
    public int countPairs(int[] nums, int k) {
        int cnt = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(i, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Objects.equals(hm.get(i), hm.get(j)) && (i * j) % k == 0) cnt++;
            }
        }
        return cnt;
    }
}

/**
 * Complexity:
 * Time:O(n^2) and Space:O(n)
 */
