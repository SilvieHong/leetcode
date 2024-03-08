// https://leetcode.com/problems/find-greatest-common-divisor-of-array/
class Solution {
    public int findGCD(int[] nums) {
        int max = 1;
        int min = 1000;

        for(int i=0; i<nums.length;i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int answer = 1;
        
        for(int i=1; i<=max;i++){
            if(max%i == 0 && min%i==0){
                answer = i;
            }
        }
        return answer;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(1)
 */
