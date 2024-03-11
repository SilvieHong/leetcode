// https://leetcode.com/problems/maximum-odd-binary-number/
class Solution {
    public String maximumOddBinaryNumber(String s) {
        Integer[] nums = new Integer[s.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(s.substring(i, i + 1));
        }

        int cnt = 0;
        for (int num : nums) {
            if (num == 1) cnt++;
        }

        String answer = "";
        if (cnt == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                answer += "0";
            }
        } else {
            for (int i = 0; i < cnt - 1; i++) {
                answer += "1";
            }
            for (int i = 0; i < nums.length - cnt; i++) {
                answer += "0";
            }
        }
        answer += "1";

        return answer;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */
