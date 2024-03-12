// https://leetcode.com/problems/matrix-diagonal-sum/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat[0].length;
        int j = 0;
        
        for (int i = 0; i < size; i++) {
            sum += mat[i][j] + mat[i][size - 1 - j];
            j++;
        }
        
        if (size % 2 == 1) sum -= mat[size / 2][size / 2];

        return sum;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(1)
 */
