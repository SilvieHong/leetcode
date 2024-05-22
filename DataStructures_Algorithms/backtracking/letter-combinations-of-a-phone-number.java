//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.isEmpty()) return result;
        String[] keypad = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");

        while (result.peek().length() != digits.length()) {
            String temp = result.remove();
            String map = keypad[digits.charAt(temp.length()) - '0'];
            for (char c : map.toCharArray()) {
                result.addLast(temp + c);
            }
        }
        return result;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */





// ANOTHER SOLUTION USING BACKTRACKING (LATER)
