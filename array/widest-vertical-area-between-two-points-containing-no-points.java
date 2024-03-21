// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // declare array for x-coordinate
        int[] x = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            x[i] = points[i][0];
        }
        Arrays.sort(x);

        // declare array for width
        int[] width = new int[points.length - 1];
        int max = 0;
        for(int i=0; i<width.length;i++) {
            width[i] = x[i + 1] - x[i];
            if (width[i] > max) max = width[i];
        }
        return max;
    }
}

/**
 * Complexity:
 * Time:O(nlogn) and Space:O(n)
 */
