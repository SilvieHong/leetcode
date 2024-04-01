// https://leetcode.com/problems/replace-all-digits-with-characters/
class Solution {
    public String replaceDigits(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
     
        for (int i = 0; i < s.length(); i += 2) {
            int index = alphabet.indexOf(s.charAt(i));

            if (s.length() % 2 != 0 && i==s.length()-1) {
                sb.append(s.charAt(i));
            } else {
                int shift = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
                sb.append(s.charAt(i)).append(alphabet.charAt(index + shift));
            }

        }
        return sb.toString();
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
