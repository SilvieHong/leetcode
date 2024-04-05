// https://leetcode.com/problems/strictly-palindromic-number/
class Solution {
    public boolean isStrictlyPalindromic(int n) {
      for (int i = 2; i < n; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(n, i));
            String before = sb.toString();
            String after = sb.reverse().toString();
            if(!before.equals(after)) return false;
        }
        return true;  
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
