// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class Solution {
    public int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[0].length - 1;
        int cnt = 0;

        while (row < grid.length && col >= 0) {
            if (grid[row][col] < 0) {
                cnt += (grid.length - row);
                col--;
            } else if (grid[row][col] >= 0) {
                row++;
            }
        }
        return cnt;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(1)
 */
