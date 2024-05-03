//https://leetcode.com/problems/hamming-distance/
class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder xb = new StringBuilder(toBinary(x));
        StringBuilder yb = new StringBuilder(toBinary(y));

        int xl = xb.length();
        int yl = yb.length();
        
        while (xl != yl) {
            if (xl > yl) {
                yb.insert(0, '0');
                yl++;
            } else {
                xb.insert(0, '0');
                xl++;
            }
        }
        
        int cnt = 0;
        for (int i = 0; i < xl; i++) {
            if (xb.charAt(i) != yb.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
  
     public static String toBinary(int num) {
        StringBuilder sb = new StringBuilder();
        boolean isEnd = false;
        int temp = num;
        while (!isEnd) {
            sb.insert(0, temp % 2);
            temp = temp / 2;
            if (temp == 0) {
                isEnd = true;
            }
        }
        return sb.toString();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(logn)
 */
