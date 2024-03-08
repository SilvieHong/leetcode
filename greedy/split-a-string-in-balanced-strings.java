// https://leetcode.com/problems/split-a-string-in-balanced-strings/
class Solution {
    public int balancedStringSplit(String s) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            cnt += (s.charAt(i) == 'R') ? 1 : -1;
            if(cnt == 0) answer++;
        }

        return answer;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(1)
 */
