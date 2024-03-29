// https://leetcode.com/problems/faulty-keyboard/
class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                sb.reverse();
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
