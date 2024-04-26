//https://leetcode.com/problems/count-asterisks/
class Solution {
    public int countAsterisks(String s) {
        int cnt = 0;
        String[] str = s.split("\\|");
        
        for (int i =0; i < str.length; i=i+2) {
            if (str[i].contains("*")) {
                int str_length = str[i].length();
                int aster_length = str[i].replace("*", "").length();
                cnt += str_length - aster_length;
            }
        }
        return cnt;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
