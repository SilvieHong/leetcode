// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
class Solution {
    public int differenceOfSum(int[] nums) {
        int el_sum = 0;
        int digit_sum = 0;

        // element_sum
        for (int i = 0; i < nums.length; i++) {
            el_sum += nums[i];
        }

        // digit_sum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 1000 > 0) {
                digit_sum += nums[i] / 1000;
                digit_sum += (nums[i] - nums[i] / 1000 * 1000) / 100;
                digit_sum += (nums[i] - nums[i] / 1000 * 1000 - (nums[i] - nums[i] / 1000 * 1000) / 100 * 100) / 10;
                digit_sum += nums[i] - nums[i] / 100 * 100 - (nums[i] - nums[i] / 1000 * 1000 - (nums[i] - nums[i] / 1000 * 1000) / 100 * 100) / 10 * 10;
            } else if (nums[i] / 100 > 0) {
                digit_sum += nums[i] / 100;
                digit_sum += (nums[i] - nums[i] / 100 * 100) / 10;
                digit_sum += nums[i] - nums[i] / 100 * 100 - (nums[i] - nums[i] / 100 * 100) / 10 * 10;
            } else if (nums[i] / 10 > 0) {
                digit_sum += nums[i] / 10;
                digit_sum += nums[i] - nums[i] / 10 * 10;
            } else {
                digit_sum += nums[i];
            }
        }

        return el_sum > digit_sum ? el_sum - digit_sum : digit_sum - el_sum;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 * But it's not easy-read and complicated
 */





class betterSolution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        
        for(int num:nums){
            sum+=num;

            while(num>0){
                int digit=num%10;
                digitSum+=digit;
                num=num/10;
            }
        }
        return Math.abs(sum - digitSum);
    }
}
