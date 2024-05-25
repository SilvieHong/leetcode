//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
class Solution {
    public String freqAlphabets(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                list.add(Integer.parseInt(s.substring(i - 2, i)));
                i -= 2;
            } else {
                list.add(Integer.parseInt(s.substring(i, i + 1)));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append((char)(list.get(i)+96));
        }
        return sb.reverse().toString();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
