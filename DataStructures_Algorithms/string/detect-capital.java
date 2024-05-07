//https://leetcode.com/problems/detect-capital/
class Solution {
    public boolean detectCapitalUse(String word) {
        String [] str = new String[3];
        str[0] = word.toUpperCase();
        str[1] = word.toLowerCase();
        str[2] = str[0].substring(0,1) + str[1].substring(1);

        for(int i=0; i<3; i++){
            if(word.equals(str[i])) return true;
        }
        return false;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
