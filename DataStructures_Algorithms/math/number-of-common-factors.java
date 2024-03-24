// https://leetcode.com/problems/number-of-common-factors/
class Solution {
    public int commonFactors(int a, int b) {
        int cnt = 0;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) cnt++;
        }

        return cnt;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
