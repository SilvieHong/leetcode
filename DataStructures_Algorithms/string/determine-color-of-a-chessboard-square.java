// https://leetcode.com/problems/determine-color-of-a-chessboard-square/
class Solution {
    public boolean squareIsWhite(String coordinates) {
        boolean answer=true;
        int num = Integer.parseInt(String.valueOf(coordinates.charAt(1))) % 2;
        switch(coordinates.charAt(0)){
            case 'a','c','e','g':
                if(num != 0) answer = false;
                break;
            case 'b','d','f','h':
                if(num == 0) answer = false;
                break;
        }
        return answer;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
