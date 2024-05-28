//https://leetcode.com/problems/consecutive-characters/
class Solution {
    public int maxPower(String s) {
        int cnt = 0;
        char[] ch = s.toCharArray();
        int temp = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && ch[i] == ch[i + 1]) {
                temp++;
            } else {
                if (temp > cnt) cnt = temp;
                temp = 1;
            }
        }
        return cnt;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
