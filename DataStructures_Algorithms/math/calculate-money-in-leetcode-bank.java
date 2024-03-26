// https://leetcode.com/problems/calculate-money-in-leetcode-bank/
class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int temp = 1;

        for (int i = 0; i < n / 7; i++) {
            for (int j = temp; j < temp + 7; j++) {
                total += j;
            }
            temp++;
        }


        if (n % 7 != 0) {
            for (int i = temp; i < temp + (n % 7); i++) {
                total += i;
            }
        }

        return total;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
