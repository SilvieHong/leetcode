//https://leetcode.com/problems/single-number/
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(!st.isEmpty() && st.peek()==nums[i]){
                st.remove(st.size()-1);
            }else{
                st.push(nums[i]);
            }
        }
        return st.peek();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 * 
 * I used "Stack"
 * Because each element in the array appears "twice" except for one element which appears only once.
 */





class betterSolution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1])
                return nums[i];
        }
        return nums[nums.length - 1];
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
