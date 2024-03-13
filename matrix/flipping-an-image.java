// https://leetcode.com/problems/flipping-an-image/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        int[][] answer = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                answer[i][j] = image[i][size - 1 - j];
                answer[i][j] = answer[i][j] == 1 ? 0 : 1;
            }
        }
        
        return answer;
    }
}

/**
 Complexity:
 Time:O(n^2) and Space:O(n^2)
 */
