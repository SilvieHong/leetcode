//https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && Math.abs(i-j)<=k) return true;
            }
        }
        return false;
    }
}
/**
 * Complexity:
 * Time:O(n^2) and Space:O(1)
 * Time Limit Exceeded
 */





class betterSolution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(i>k) set.remove(nums[i-k-1]);
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
