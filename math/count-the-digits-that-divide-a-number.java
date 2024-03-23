// https://leetcode.com/problems/count-the-digits-that-divide-a-number/
class Solution {
    public int countDigits(int num) {
        int cnt = 0;
        String str = Integer.toString(num);

        for (int i = 0; i < str.length(); i++) {
            if (num % Integer.parseInt(String.valueOf(str.charAt(i))) == 0) cnt++;
        }
        
        return cnt;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
