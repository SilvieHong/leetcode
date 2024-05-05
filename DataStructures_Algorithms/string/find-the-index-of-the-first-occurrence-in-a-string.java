//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;

        int i = 0;
        while (true) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() == 1 || haystack.startsWith(needle, i)) {
                    return i;
                }
            }
            i++;
        }
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
