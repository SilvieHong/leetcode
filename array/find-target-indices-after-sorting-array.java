// https://leetcode.com/problems/find-target-indices-after-sorting-array/
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            if(nums[i] == target) answer.add(i);
        }
        return answer;
    }
}

/**
Complexity:
Time:O(nlogn) and Space:O(n)
*/
