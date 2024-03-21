// https://leetcode.com/problems/maximum-69-number/
class Solution {
    public int maximum69Number (int num) {
        char[] arr = Integer.toString(num).toCharArray();
        String str = Integer.toString(num);
        if (str.contains("6")) arr[str.indexOf("6")] = '9';
        str = String.valueOf(arr);
        return Integer.parseInt(str);
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
