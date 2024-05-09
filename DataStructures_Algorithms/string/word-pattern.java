//https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (str.length != pattern.length()) return false;
        HashMap<Character, String> hm = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (!hm.isEmpty() && hm.containsKey(pattern.charAt(i))) {
                if (!hm.get(pattern.charAt(i)).equals(str[i])) {
                    return false;
                }
            } else if (hm.containsValue(str[i])) {
                return false;
            } else {
                hm.put(pattern.charAt(i), str[i]);
            }
        }
        return true;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
