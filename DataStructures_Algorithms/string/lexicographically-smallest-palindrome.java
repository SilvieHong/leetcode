//https://leetcode.com/problems/lexicographically-smallest-palindrome/
class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int head = s.charAt(i);
            int tail = s.charAt(s.length()-1-i);

            if(head < tail){
                sb.append(s.charAt(i));
            }else{
                sb.append(s.charAt(s.length()-1-i));
            }
        }
        return sb.toString();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
