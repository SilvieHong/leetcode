//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        if (sentence.length() < 26) {
            return false;
        }
        for(int i=0; i<alphabet.length(); i++) {
            if (!sentence.contains(alphabet.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
