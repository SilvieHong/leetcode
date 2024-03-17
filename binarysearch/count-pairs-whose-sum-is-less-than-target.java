// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0;
        for(int i=0; i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    System.out.println(nums.get(i)+ " " + nums.get(j));
                    cnt++;
                }
            }
        }

        return cnt;
    }
}

/**
 Complexity:
 Time:O(n^2) and Space:O(1)
 */





// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/solutions/3933451/two-pointers-approach-easy-to-understand-in-9-languages/
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); // sort the vector nums
        int count = 0;   // variable to store the count
        int left = 0;    // variable to store the left
        int right = nums.size() - 1;  // variable to store the right

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}

/**
 Complexity:
 Time:O(nlogn) and Space:O(1)
 
 Input: nums = [2,5,7,8,3], target = 10
 output : 4+3+2+1 = 10

 +------+-------+------------+-------------+------------------------+-------+
 | left | right | nums[left] | nums[right] | nums[left]+nums[right] | count |
 |   0  |   4   |     2      |      8      |       2 + 8 = 10       |   4   |
 |   0  |   3   |     2      |      7      |       2 + 7 =  9       |   3   |
 |   0  |   2   |     2      |      5      |       2 + 5 =  7       |   2   |
 |   0  |   1   |     2      |      3      |       2 + 3 =  5       |   1   |
 |   1  |   1   |     3      |      3      |       3 + 3 =  6       |   0   |
 +------+-------+------------+-------------+------------------------+-------+
 
 */
