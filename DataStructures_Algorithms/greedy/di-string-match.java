//https://leetcode.com/problems/di-string-match/
class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int head = 0, tail = s.length();
        int idx = 0;

        while (idx < s.length()) {
            if (s.charAt(idx) == 'I') {
                ans[idx] = head;
                head++;
            } else {
                ans[idx] = tail;
                tail--;
            }
            idx++;
        }
        ans[ans.length - 1] = tail;;
        return ans;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
