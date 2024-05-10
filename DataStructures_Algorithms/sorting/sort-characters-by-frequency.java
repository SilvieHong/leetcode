//https://leetcode.com/problems/sort-characters-by-frequency/
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        List<Character> keySet = new ArrayList<>(hm.keySet());
        keySet.sort((o1, o2) -> hm.get(o2).compareTo(hm.get(o1)));
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keySet.size(); i++) {
            sb.append(String.valueOf(keySet.get(i)).repeat(Math.max(0, hm.get(keySet.get(i)))));
        }
        return sb.toString();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
