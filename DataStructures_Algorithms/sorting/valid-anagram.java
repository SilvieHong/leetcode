//https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for(int i=0; i<s.length();i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(1)
 */





class betterSolution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a'] += 1;
        }
        for(char ch : t.toCharArray()){
            freq[ch-'a'] -= 1;
        }
        for(int i : freq){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
