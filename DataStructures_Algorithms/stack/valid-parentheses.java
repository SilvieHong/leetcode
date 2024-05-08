//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && st.peek() == '(') {
                st.pop();
            } else if (s.charAt(i) == ']' && st.peek() == '[') {
                st.pop();
            } else if (s.charAt(i) == '}' && st.peek() == '{') {
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
