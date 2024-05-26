//https://leetcode.com/problems/permutation-difference-between-two-strings/
class Solution {
    public int findPermutationDifference(String s, String t) {
        int n = s.length();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map1.put(s.charAt(i) - 'a', i);
        }

        for (int i = 0; i < n; i++) {
            map2.put(t.charAt(i) - 'a', i);
        }

        int cnt = 0;
        for (int i : map1.keySet()) {
            cnt += Math.abs(map1.get(i) - map2.get(i));
        }
        return cnt;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
