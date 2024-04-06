// https://leetcode.com/problems/sum-of-digits-in-base-k/
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        String num = Integer.toString(n, k);

        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return sum;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(logn)
 */
