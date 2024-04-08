//https://leetcode.com/problems/reverse-string/
class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length; i++){
            sb.append(s[i]);
        }

        String reversed = String.valueOf(sb.reverse());

        for(int i=0; i<s.length; i++){
            s[i] = reversed.charAt(i);
        }
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */



class betterSolution {
    public void reverseString(char[] s) {
        int pointer1 = 0;
        int pointer2 = s.length - 1;
        while (pointer1 < pointer2) {
            char hold = s[pointer1];
            s[pointer1] = s[pointer2];
            s[pointer2] = hold;
            pointer1++;
            pointer2--;
        }
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
