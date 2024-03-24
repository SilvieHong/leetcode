// https://leetcode.com/problems/split-with-minimum-sum/
class Solution {
    public int splitNum(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        Arrays.sort(arr);

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                str1 += arr[i];
            } else {
                str2 += arr[i];
            }
        }
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}

/**
 * Complexity:
 * Time:O(1) and Space:O(1)
 */
