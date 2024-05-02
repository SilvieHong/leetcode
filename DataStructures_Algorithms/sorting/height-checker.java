//https://leetcode.com/problems/height-checker/
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        for (int i = expected.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (expected[j] > expected[j + 1]) {
                    int temp = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = temp;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != expected[i]) cnt++;
        }
        return cnt;
    }
}
/**
 * Complexity:
 * Time:O(n^2) and Space:O(n)
 */
