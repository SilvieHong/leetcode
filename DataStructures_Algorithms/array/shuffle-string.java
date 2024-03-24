// https://leetcode.com/problems/shuffle-string/
class Solution {
    public String restoreString(String s, int[] indices) {
        char [] ch = new char[s.length()];
        for(int i=0; i<s.length();i++){
            ch[indices[i]] = s.charAt(i);
        }

        String answer ="";
        for(int i=0; i<s.length();i++){
            answer += ch[i];
        }

        return answer;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */
