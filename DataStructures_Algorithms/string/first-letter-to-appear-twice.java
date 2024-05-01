//https://leetcode.com/problems/first-letter-to-appear-twice/
class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet();

        for (int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                return s.charAt(i);
            }
        }
        return 0;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
