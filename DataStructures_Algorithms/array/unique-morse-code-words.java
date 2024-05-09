//https://leetcode.com/problems/unique-morse-code-words/
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            morse[i] = toMorse(words[i]);
        }

        Set<String> set = new HashSet<>(Arrays.asList(morse));
        return set.size();
    }
    public static String toMorse(String s) {
        String[] str = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
            int ch = s.charAt(i);
            sb.append(str[ch-'a']);
        }
        return sb.toString();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
