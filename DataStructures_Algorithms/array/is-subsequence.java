//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(Objects.equals(s, "")){
            return true;
        }else if(Objects.equals(t, "")){
            return false;
        }
        
        char[] ch = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == ch[idx]) {
                idx++;
                if (idx == ch.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
