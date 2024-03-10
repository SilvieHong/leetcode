// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int sortedNum : sortedNums) {
                if (nums[i] > sortedNum) answer[i]++;
            }
        }
        return answer;
    }
}

/**
 Complexity:
 Time:O(n^2) and Space:O(n)
 */





// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/solutions/641884/java-o-n-1ms-less-memory-than-100-explained/
class betterSolution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];
        
        for(int i=0; i<nums.length; i++) {
            buck[nums[i]] +=1;
        }
        
        for(int j=1; j<= 100; j++) {
            buck[j] += buck[j-1];
        }
        
        for(int k=0; k< nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos==0 ? 0 : buck[pos-1];
        }
        
        return nums;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */
