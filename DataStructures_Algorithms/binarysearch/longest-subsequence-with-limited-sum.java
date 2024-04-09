//https://leetcode.com/problems/longest-subsequence-with-limited-sum/
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        
        for(int i=0; i<answer.length; i++){
            int temp = queries[i];
            for(int j=0; j<nums.length; j++){
                if(temp-nums[j] >=0){
                    temp -=nums[j];
                    answer[i]++;
                }else{
                    break;
                }
            }
        }
        return answer;
    }
}

/**
 * Complexity:
 * Time:O(n^2) and Space:O(n)
 */



class betterSolution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int position = binarySearch(nums, queries[i]);
            result[i] = position;
        }
        return result;
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid + 1;
            } 
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;    
            }
        }
        return nums[left] > target ? left : left + 1;
    }
}

/**
 * Complexity:
 * Time:O(nlogn) and Space:O(length of queries)
 */
