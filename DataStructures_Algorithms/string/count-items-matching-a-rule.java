//https://leetcode.com/problems/count-items-matching-a-rule/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0, n = 0;

        switch (ruleKey) {
            case "type" -> n = 0;
            case "color" -> n = 1;
            case "name" -> n = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (Objects.equals(items.get(i).get(n), ruleValue)){
                cnt++;
            }
        }
        
        return cnt;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
