// https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);

        do {
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1) {
                    sum += nums[i];
                    nums[i]++;
                }
            }
            k--;
        } while (k != 0);

        return sum;
    }
}

/**
 Complexity:
 Time:O(nlogn) and Space:O(1)
 */





// https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/solutions/3467980/easiest-solution-out-there-in-o-n/
class betterSolution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i<nums.length; i++){ 
            max = Math.max(max, nums[i]);
        }
        
        int ans = 0;
        while(k > 0){
            ans += max;
            max = max+1;
            k--;
        }
        return ans;
    }   
}

/**
 Complexity:
 Time:O(n) and Space:O(1)
 */
