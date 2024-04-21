//https://leetcode.com/problems/merge-strings-alternately/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        int a = 0;
        int b = 0;

        // take turns to append the char until the smallest length between word1 and word2
        for (int i = 0; i < Math.min(word1.length(), word2.length()) * 2; i++) {
            if (i % 2 == 0) {
                sb.append(ch1[a]);
                a++;
            } else {
                sb.append(ch2[b]);
                b++;
            }
        }
        
        // return the answer, or retrun the answer after append the leftovers
        if(word1.length()== word2.length()){
            return sb.toString();
        }else if(word1.length() > word2.length()){
            sb.append(word1.substring(word2.length()));
        }else{
            sb.append(word2.substring(word1.length()));
        }
        
        return sb.toString();
    }
}
/**
 * Complexity:
 * Time:O(min(word1.length(), word2.length()) and Space:O(n)
 */
