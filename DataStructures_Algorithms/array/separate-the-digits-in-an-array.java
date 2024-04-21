//https://leetcode.com/problems/separate-the-digits-in-an-array/
class Solution {
    public int[] separateDigits(int[] nums) {
        // merge the number, and convert to string type
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }

        // split the number
        int[] answer = new int[sb.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }

        return answer;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
