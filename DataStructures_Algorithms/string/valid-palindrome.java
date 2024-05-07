//https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >=48 && s.charAt(i)<=57) {
                sb.append(s.charAt(i));
            }
        }

        String str = sb.toString().toLowerCase();
        int idx = str.length() - 1;
        for(int i=0; i<str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(idx - i))
                return false;
        }
        return true;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
