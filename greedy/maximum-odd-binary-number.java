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





// https://leetcode.com/problems/maximum-odd-binary-number/solutions/4802354/beats-100-users-c-java-python-javascript-2-approaches-explained/
class betterSolution {
    public String maximumOddBinaryNumber(String s) {
        int cnt1 = 0, cnt0 = 0;
        for (char a : s.toCharArray()) {
            if (a == '1') cnt1++;
            else if (a == '0') cnt0++;
        }
        StringBuilder ans = new StringBuilder();
        ans.append("1".repeat(cnt1 - 1));
        ans.append("0".repeat(cnt0));
        ans.append("1");
        return ans.toString();
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */
