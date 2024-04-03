// https://leetcode.com/problems/a-number-after-a-double-reversal/
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0) return true;
        String str = Integer.toString(num);
        if(str.charAt(str.length()-1)=='0') return false;
        return true;
    }
}

/**
 * Complexity:
 * Time:O(1) and Space:O(logn)
 */
