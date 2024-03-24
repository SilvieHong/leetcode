// https://leetcode.com/problems/count-of-matches-in-tournament/
class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;

        while (n != 1) {
            if (n % 2 == 0) { //even
                matches += n / 2;
                n = n / 2;
            } else {  // odd
                matches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        
        return matches;
    }
}

/**
 * Complexity:
 * Time:O(logn) and Space:O(1)
 */
