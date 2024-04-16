//https://leetcode.com/problems/sort-the-people/
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] answer = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            answer[index] = map.get(heights[i]);
            index++;
        }
        return answer;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
