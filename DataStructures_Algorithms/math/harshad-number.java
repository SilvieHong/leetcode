// https://leetcode.com/problems/harshad-number/
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x < 10) {
            return x;
        } else if (x == 100) {
            return 1;
        } else {
            int num1 = x / 10;
            int num2 = x - (x / 10) * 10;
            if (x % (num1 + num2) == 0) {
                return num1 + num2;
            } else {
                return -1;
            }
        }
    }
}

/**
 * Complexity:
 * Time:O(1) and Space:O(1)
 */
