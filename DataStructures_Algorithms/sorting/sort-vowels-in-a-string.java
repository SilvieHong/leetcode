//https://leetcode.com/problems/sort-vowels-in-a-string/
class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    sb.append('*');
                    vowels.add(s.charAt(i));
                    break;
                default:
                    sb.append(s.charAt(i));
            }
        }
        Collections.sort(vowels);
        
        int idx=0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '*') {
                sb.replace(i,i+1, String.valueOf(vowels.get(idx)));
                idx++;
            }
        }
        return sb.toString();
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(n)
 */
