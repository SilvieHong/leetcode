//https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
            if(nums[i] == target) return i;
        }

        list.add(target);
        Collections.sort(list);
        return list.indexOf(target);
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
