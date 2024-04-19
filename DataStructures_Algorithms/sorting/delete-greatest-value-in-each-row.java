//https://leetcode.com/problems/delete-greatest-value-in-each-row/
class Solution {
    public int deleteGreatestValue(int[][] grid) {
       for (int i = 0; i < grid.length; i++) Arrays.sort(grid[i]);
        
        int sum = 0;
        
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            sum += max;
        }
        
        return sum;
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(1)
 */
